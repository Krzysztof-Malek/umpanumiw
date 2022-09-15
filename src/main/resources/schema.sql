create sequence component_sequence start with 1 increment by 1;
create table gate_history (id bigint not null, component_state varchar(255) not null, date timestamp not null, primary key (id));
create table move_detector_readings (id bigint not null, component_state varchar(255) not null, date timestamp not null, activated boolean not null, primary key (id));
create table pool_thermometer_readings (id bigint not null, component_state varchar(255) not null, date timestamp not null, temperature double not null, unit varchar(255) not null, primary key (id));
create table pump_history (id bigint not null, component_state varchar(255) not null, date timestamp not null, primary key (id));
create table room_thermometer_readings (id bigint not null, component_state varchar(255) not null, date timestamp not null, temperature double not null, unit varchar(255) not null, primary key (id));
create table sprinkler_history (id bigint not null, component_state varchar(255) not null, date timestamp not null, cycle_end float not null, cycle_start float not null, week_day varchar(255) not null, primary key (id));
