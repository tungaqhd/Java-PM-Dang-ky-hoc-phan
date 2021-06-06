use master
drop database DKHP
create database DKHP

use DKHP

create table khoa (
	ma_khoa int not null identity,
	ten_khoa nvarchar(50),
	constraint pk_khoa primary key(ma_khoa)
)

insert into khoa values
(N'Công nghệ thông tin'),
(N'Quản lý kinh doanh'),
(N'Cơ khí'),
(N'May và thiết kế thời trang')

create table nganh (
	ma_nganh int not null identity,
	ten_nganh nvarchar(50),
	ma_khoa int,
	constraint fk_nganh_khoa foreign key(ma_khoa) references khoa(ma_khoa) on update cascade on delete cascade,
	constraint pk_nganh primary key(ma_nganh)
)

insert into nganh values
(N'Công nghệ thông tin', 1),
(N'Kỹ thuật máy tính', 1),
(N'Khoa học máy tính', 1),
(N'Hệ thống thông tin', 1),
(N'Quản trị kinh doanh', 2),
(N'Quản trị nhân lực', 2),
(N'Quản trị văn phòng', 2),
(N'Cơ khí', 3),
(N'Thiết kế thời trang', 4),
(N'Công nghệ dệt may', 4)

create table sinhvien (
	ma_sv varchar(15),
	mat_khau char(100),
	ho_ten nvarchar(50),
	tai_khoan int,
	ma_nganh int,
	email varchar(50) unique,
	sdt char(10) unique,
	constraint pk_sv primary key(ma_sv),
	constraint fk_sv_nganh foreign key(ma_nganh) references nganh(ma_nganh) on update cascade on delete cascade
)

insert into sinhvien values
('100', '123', N'Nguyễn Sỹ Tùng', 10000000, 1, 'sv1@haui.vn', '123'),
('101', '123', N'Đào Xuân Vinh', 10000000, 1, 'sv2@haui.vn', '234'),
('102', '123', N'Nguyễn Đình Việt', 10000000, 1, 'sv3@haui.vn', '345'),
('103', '123', N'Phạm Văn Bắc', 10000000, 1, 'sv4@haui.vn', '456'),
('104', '123', N'Lê Văn Nam', 10000000, 1, 'sv5@haui.vn', '567'),
('105', '123', N'Bùi Thị Chi', 10000000, 1, 'sv6@haui.vn', '678'),
('106', '123', N'Phạm Xuân Tiệp', 10000000, 2, 'sv7@haui.vn', '789'),
('107', '123', N'Phạm Thảo Chi', 10000000, 5, 'sv8@haui.vn', '8910'),
('108', '123', N'Ngô Thị Hòa', 10000000, 6, 'sv9@haui.vn', '91011'),
('109', '123', N'Bùi Minh Trí', 10000000, 8, 'sv10@haui.vn', '101112'),
('110', '123', N'Phùng Văn Linh', 10000000, 9, 'sv11@haui.vn', '111213')

create table giangvien (
	ma_gv int not null identity,
	ho_ten nvarchar(50),
	email varchar(50) unique,
	mat_khau char(100),
	sdt char(10) unique,
	constraint pk_gv primary key(ma_gv)
)

insert into giangvien values
(N'Nguyễn Thị A', 'gv1@haui.edu.vn', '123',  '0123456789'),
(N'Nguyễn Văn B', 'gv2@haui.edu.vn', '123',  '0123456788'),
(N'Bùi Hữu C', 'gv3@haui.edu.vn', '123',  '0123456787')

create table qtv (
	ma_qtv int not null identity,
	ho_ten nvarchar(50),
	email varchar(50) unique,
	mat_khau char(100),
	sdt char(10) unique,
	constraint pk_qtv primary key(ma_qtv)
)

insert into qtv values
(N'Phùng Văn A', 'qtv1@haui.edu.vn', '123', '0123456789'),
(N'Phùng Văn B', 'qtv2@haui.edu.vn', '123', '0123456788'),
(N'Nguyễn Thị C', 'qtv3@haui.edu.vn', '123', '0123456787'),

create table phong (
	ma_phong int not null identity,
	ten_phong nvarchar(30),
	toa_nha varchar(5),
	co_so int,
	constraint pk_phong primary key(ma_phong)
)

insert into phong values
('701', 'A1', 1),
('702', 'A2', 1),
('703', 'A3', 1),
('704', 'A4', 1),
('705', 'A5', 1),
('706', 'A1', 2),
('707', 'A2', 2),
('708', 'A3', 2),
('709', 'A4', 3),
('710', 'A5', 3)


create table hoc_phan (
	ma_in varchar(10) unique,
	ma_hp varchar(10) unique,
	ten_hp nvarchar(50),
	tc_lt int,
	tc_th int,
	tc_khac int,
	constraint pk_hp primary key(ma_hp)
)

insert into hoc_phan values
('HP3627', '1203106', N'Những nguyên lý cơ bản của chủ nghĩa Mác-Lênin', 5, 0, 0),
('HP3837', '1203108', N'Tư tưởng Hồ Chí Minh', 2, 0, 0),
('HP4692', '1303195', N'Tiếng Anh Công nghệ thông tin	', 5, 0, 0),
('HP3806', '1003107', N'Toán cao cấp 1', 3, 0, 0),
('HP4273', '0503170', N'Kỹ thuật số', 3, 0, 0),
('HP3461', '0503129', N'Lập trình căn bản', 2, 1, 0),
('HP3363', '0503126', N'Kiến trúc máy tính', 2, 1, 0),
('HP3222', '0503116', N'Đồ họa máy tính	', 2, 1, 0),
('HP3465', '0503130', N'Lập trình hướng đối tượng', 2, 1, 0),
('HP6942', '0503200', N'Nhập môn Công nghệ phần mềm', 3, 0, 0),
('HP3261', '0503123', N'Hệ quản trị cơ sở dữ liệu (SQL Server)	', 2, 1, 0),
('HP3860', '0503159', N'Thiết kế cơ sở dữ liệu', 2, 0, 1),
('HP3671', '0503152', N'Quản lý các dự án công nghệ thông tin', 1, 0, 1),
('HP4271', '0503168', N'Công nghệ đa phương tiện', 2, 1, 1)

create table lop (
	ma_lop varchar(15),
	ten_lop varchar(15),
	cdio int,
	si_so int,
	ma_hp varchar(10),
	ma_gv int,
	constraint fk_lop_hp foreign key(ma_hp) references hoc_phan(ma_hp) on update cascade on delete cascade,
	constraint fk_lop_gv foreign key(ma_gv) references giangvien(ma_gv) on update cascade on delete cascade,
	constraint pk_lop primary key(ma_lop)
)
alter table lop add so_luong int default 0

create table mo_lop (
	ma_lop varchar(15),
	ma_nganh int,
	constraint fk_mo_lop_lop foreign key(ma_lop) references lop(ma_lop) on update cascade on delete cascade,
	constraint fk_mo_lop_khoa foreign key(ma_nganh) references nganh(ma_nganh) on update cascade on delete cascade,
	constraint pk_mo_lop primary key(ma_lop, ma_nganh)
)


create table su_dung_phong (
	ma_lop varchar(15),
	ma_phong int,
	thu nvarchar(10),
	tiet_bat_dau int,
	tiet_ket_thuc int,
	constraint fk_sd_lop foreign key(ma_lop) references lop(ma_lop) on update cascade on delete cascade,
	constraint fk_sd_phong foreign key(ma_phong) references phong(ma_phong) on update cascade on delete cascade,
	constraint pk_sd primary key(ma_lop, ma_phong, thu, tiet_bat_dau, tiet_ket_thuc)
)

create table dang_ky_hoc (
	ma_dk_hoc int not null identity,
	ma_sv varchar(15),
	ma_lop varchar(15),
	constraint fk_dk_sv foreign key(ma_sv) references sinhvien(ma_sv) on update cascade on delete cascade,
	constraint fk_dk_lop foreign key(ma_lop) references lop(ma_lop) on update cascade on delete cascade,
	constraint pk_dk primary key(ma_dk_hoc)
)
update sinhvien set tai_khoan = 10000000