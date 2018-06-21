

/** Table 1  Role 权限表 **/

create table Role (
        id varchar(255) not null,
        roleName varchar(255) null,
        primary key (id)
    );
insert into Role values('0000','管理员');
insert into Role values('0001','职员');
insert into Role values('0002','部门经理');
insert into Role values('0003','领导');
    
    
/** Table 2 Users 用户表 **/   
     create table Users (
        id varchar(255) not null,
        address varchar(255) null,
        age varchar(255) null,
        email varchar(255) null,
        interests varchar(255) null,
        introduction varchar(255) null,
        mobilephone varchar(255) null,
        password varchar(255) null,
        phone varchar(255) null,
        position varchar(255) null,
        sex varchar(255) null,
        username varchar(255) null,
        role_id varchar(255) null,
        primary key (id)
    );
   alter table Users 
   add constraint FK4E39DE83CE30D67  
   foreign key (role_id)  references Role;