# testapp
create table "Sensors"
(
    "Id"        integer not null
        constraint id
            primary key,
    "Name"      text    not null,
    "Model"     text    not null,
    "RangeFrom" numeric not null,
    "RangeTo"   numeric not null,
    "Type"      text    not null,
    "Unit"      text    not null,
    "Location"  text    not null
);
