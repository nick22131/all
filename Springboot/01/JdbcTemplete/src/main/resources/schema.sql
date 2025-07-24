  create table contact_msg (
      contact_id int AUTO_INCREMENT primary key,
      name varchar(30) not null,
      mobile_num varchar(10) not null,
      email varchar(40) not null,
      subject varchar(30) not null,
      message varchar(100) not null,
      status varchar(10) not null,
      created_at timestamp not null,
      created_by varchar(30) not null,
      updated_by varchar(30) default null,
      updated_at timestamp default null
  );
