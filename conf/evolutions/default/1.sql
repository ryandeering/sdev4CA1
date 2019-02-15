# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table department (
  did                           integer not null,
  dep_name                      varchar(255),
  constraint pk_department primary key (did)
);
create sequence DEPARTMENT_seq increment by 1;

create table employee (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  dep_did                       integer,
  constraint pk_employee primary key (email)
);

alter table employee add constraint fk_employee_dep_did foreign key (dep_did) references department (did) on delete restrict on update restrict;
create index ix_employee_dep_did on employee (dep_did);


# --- !Downs

alter table employee drop constraint if exists fk_employee_dep_did;
drop index if exists ix_employee_dep_did;

drop table if exists department;
drop sequence if exists DEPARTMENT_seq;

drop table if exists employee;

