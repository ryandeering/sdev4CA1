package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.employees.*;

public class Auth extends Action.Simple {
    public CompletionStage<Result> call(Http.Context ctx) {
        String id = ctx.session().get("email");
        if (id != null) {
            User e = User.getUserById(id);
            if ("manager".equals(e.getRole()) || ("employee".equals(e.getRole()))) {
                return delegate.call(ctx);
            }
        }

        ctx.flash().put("error", "Valid Login Required");
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}