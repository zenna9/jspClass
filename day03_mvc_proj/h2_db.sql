create table saram(
	id int primary key auto_increment,
	name varchar2(20) not null,
	phone varchar2(20) ,
	email varchar2(100)
);

insert into saram(name, phone, email) values ('Hong','010-1111-1111', 'hong@aaa.com');
insert into saram(name, phone, email) values ('Kim','010-2222-2222', 'kim@aaa.com');

select * from saram;

commit;