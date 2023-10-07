# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_mainproject
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2022-03-23 23:26:57
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_mainproject'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_mainproject" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "db_mainproject";


#
# Table structure for table 'tbl_admin'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_admin" (
  "admin_id" int(10) unsigned NOT NULL auto_increment,
  "admin_username" varchar(50) NOT NULL,
  "admin_password" varchar(50) default NULL,
  PRIMARY KEY  ("admin_id"),
  UNIQUE KEY "admin_id" ("admin_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_admin'
#

LOCK TABLES "tbl_admin" WRITE;
/*!40000 ALTER TABLE "tbl_admin" DISABLE KEYS;*/
REPLACE INTO "tbl_admin" ("admin_id", "admin_username", "admin_password") VALUES
	('1','admin','admin');
/*!40000 ALTER TABLE "tbl_admin" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_cartbody'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_cartbody" (
  "cbody_id" int(10) unsigned NOT NULL auto_increment,
  "cart_id" int(10) unsigned default NULL,
  "cart_qty" int(10) unsigned default NULL,
  "cart_status" int(10) unsigned default '0',
  "sproduct_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("cbody_id")
);



#
# Dumping data for table 'tbl_cartbody'
#

# No data found.



#
# Table structure for table 'tbl_carthead'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_carthead" (
  "cart_id" int(10) unsigned NOT NULL auto_increment,
  "user_id" date default NULL,
  "booking_status" int(10) unsigned default '0',
  "payment_status" int(10) unsigned default '0',
  "grand_total" int(10) unsigned default NULL,
  "booking_date" date default NULL,
  PRIMARY KEY  ("cart_id")
);



#
# Dumping data for table 'tbl_carthead'
#

# No data found.



#
# Table structure for table 'tbl_complaints'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_complaints" (
  "complaint_id" int(10) unsigned NOT NULL auto_increment,
  "complaint_title" varchar(50) default NULL,
  "complaint_description" varchar(500) default NULL,
  "complaint_date" date default NULL,
  "complaint_status" int(10) unsigned default '0',
  "complaint_reply" varchar(150) default NULL,
  "user_id" int(10) unsigned default NULL,
  "worker_id" int(10) unsigned default NULL,
  "landlord_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("complaint_id"),
  UNIQUE KEY "complaint_id" ("complaint_id")
);



#
# Dumping data for table 'tbl_complaints'
#

# No data found.



#
# Table structure for table 'tbl_district'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_district" (
  "district_id" int(10) unsigned NOT NULL auto_increment,
  "district_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("district_id"),
  UNIQUE KEY "district_id" ("district_id")
) AUTO_INCREMENT=10;



#
# Dumping data for table 'tbl_district'
#

LOCK TABLES "tbl_district" WRITE;
/*!40000 ALTER TABLE "tbl_district" DISABLE KEYS;*/
REPLACE INTO "tbl_district" ("district_id", "district_name") VALUES
	('1','Ernakulam');
REPLACE INTO "tbl_district" ("district_id", "district_name") VALUES
	('4','Thiruvanadapuram');
REPLACE INTO "tbl_district" ("district_id", "district_name") VALUES
	('5','Idukki');
REPLACE INTO "tbl_district" ("district_id", "district_name") VALUES
	('6','Kottayam');
REPLACE INTO "tbl_district" ("district_id", "district_name") VALUES
	('7','Kollam');
REPLACE INTO "tbl_district" ("district_id", "district_name") VALUES
	('8','Wayanad');
/*!40000 ALTER TABLE "tbl_district" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_feedback'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_feedback" (
  "feedback_id" int(10) unsigned NOT NULL auto_increment,
  "feedback_description" varchar(500) default NULL,
  "feedback_date" date default NULL,
  "user_id" int(10) unsigned default NULL,
  "worker_id" int(10) unsigned default NULL,
  "landlord_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("feedback_id"),
  UNIQUE KEY "feedback_id" ("feedback_id")
);



#
# Dumping data for table 'tbl_feedback'
#

# No data found.



#
# Table structure for table 'tbl_land'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_land" (
  "land_id" int(10) unsigned NOT NULL auto_increment,
  "land_image" varchar(50) default NULL,
  "land_tokenamount" int(10) unsigned default NULL,
  "land_address" varchar(500) default NULL,
  "landlord_id" int(10) unsigned default NULL,
  "land_status" int(10) unsigned default '0',
  "location_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("land_id"),
  UNIQUE KEY "land_id" ("land_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_land'
#

LOCK TABLES "tbl_land" WRITE;
/*!40000 ALTER TABLE "tbl_land" DISABLE KEYS;*/
REPLACE INTO "tbl_land" ("land_id", "land_image", "land_tokenamount", "land_address", "landlord_id", "land_status", "location_id") VALUES
	('1','Land_1281.jpg','50000','bangtan 
                        ','2','1','1');
REPLACE INTO "tbl_land" ("land_id", "land_image", "land_tokenamount", "land_address", "landlord_id", "land_status", "location_id") VALUES
	('2','Land_1256.jpg','50000','erdtfyghvbbjn 
                        ','3','0','3');
/*!40000 ALTER TABLE "tbl_land" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_landbooking'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_landbooking" (
  "landbooking_id" int(10) unsigned NOT NULL auto_increment,
  "user_id" int(10) unsigned default NULL,
  "land_id" int(10) unsigned default NULL,
  "booking_date" date default NULL,
  "booked_date" date default NULL,
  "landbooking_pstatus" int(10) unsigned default '0',
  PRIMARY KEY  ("landbooking_id"),
  UNIQUE KEY "landbooking_id" ("landbooking_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_landbooking'
#

LOCK TABLES "tbl_landbooking" WRITE;
/*!40000 ALTER TABLE "tbl_landbooking" DISABLE KEYS;*/
REPLACE INTO "tbl_landbooking" ("landbooking_id", "user_id", "land_id", "booking_date", "booked_date", "landbooking_pstatus") VALUES
	('1','3','1','2022-03-05','2022-03-26','1');
REPLACE INTO "tbl_landbooking" ("landbooking_id", "user_id", "land_id", "booking_date", "booked_date", "landbooking_pstatus") VALUES
	('2','3','2','2022-03-05','2022-03-22','0');
REPLACE INTO "tbl_landbooking" ("landbooking_id", "user_id", "land_id", "booking_date", "booked_date", "landbooking_pstatus") VALUES
	('3','1','1','2022-03-06','2022-03-25','3');
/*!40000 ALTER TABLE "tbl_landbooking" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_landlord'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_landlord" (
  "landlord_id" int(10) unsigned NOT NULL auto_increment,
  "landlord_name" varchar(50) default NULL,
  "landlord_gender" varchar(50) default NULL,
  "landlord_contact" varchar(50) default NULL,
  "landlord_email" varchar(50) default NULL,
  "landlord_dob" date default NULL,
  "landlord_doj" date default NULL,
  "landlord_photo" varchar(50) default NULL,
  "landlord_password" varchar(50) default NULL,
  "landlord_proof" varchar(50) default NULL,
  "landlord_vstatus" int(10) unsigned default '0',
  "place_id" int(10) unsigned default NULL,
  "landlord_address" varchar(500) default NULL,
  PRIMARY KEY  ("landlord_id"),
  UNIQUE KEY "landlord_id" ("landlord_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tbl_landlord'
#

LOCK TABLES "tbl_landlord" WRITE;
/*!40000 ALTER TABLE "tbl_landlord" DISABLE KEYS;*/
REPLACE INTO "tbl_landlord" ("landlord_id", "landlord_name", "landlord_gender", "landlord_contact", "landlord_email", "landlord_dob", "landlord_doj", "landlord_photo", "landlord_password", "landlord_proof", "landlord_vstatus", "place_id", "landlord_address") VALUES
	('1','Anjana Santhosh','Female','9998887777','as.anjanasanthosh@gmail.com','2001-09-29',NULL,'Landlord_1518.jpg','123','LandlordProof_1474.jpg','2','1','dhgcfxgdhf');
REPLACE INTO "tbl_landlord" ("landlord_id", "landlord_name", "landlord_gender", "landlord_contact", "landlord_email", "landlord_dob", "landlord_doj", "landlord_photo", "landlord_password", "landlord_proof", "landlord_vstatus", "place_id", "landlord_address") VALUES
	('2','Lisa','Female','9638527410','lisa@gmail.com','1996-03-15',NULL,'Landlord_1175.jpg','lisa','LandlordProof_1283.jpg','1','1',' sncbj           shdghesgfh            
                        
                        
                        
                        
                        
                        
                        ');
REPLACE INTO "tbl_landlord" ("landlord_id", "landlord_name", "landlord_gender", "landlord_contact", "landlord_email", "landlord_dob", "landlord_doj", "landlord_photo", "landlord_password", "landlord_proof", "landlord_vstatus", "place_id", "landlord_address") VALUES
	('3','Jenni','Female','9876543210','jenni@gmail.com','1994-12-20','2022-02-04','Landlord_1264.png','nini','LandlordProof_2088.jpg','1','3','asdfghjkl                        ');
REPLACE INTO "tbl_landlord" ("landlord_id", "landlord_name", "landlord_gender", "landlord_contact", "landlord_email", "landlord_dob", "landlord_doj", "landlord_photo", "landlord_password", "landlord_proof", "landlord_vstatus", "place_id", "landlord_address") VALUES
	('4','Bushra Basheer','Female','9286532520','bushrabasheer2002@gmail.com','2002-01-08','2022-02-05','Landlord_1007.jpg','bushra','LandlordProof_1896.jpg','1','1','asderftgyhuj                        ');
REPLACE INTO "tbl_landlord" ("landlord_id", "landlord_name", "landlord_gender", "landlord_contact", "landlord_email", "landlord_dob", "landlord_doj", "landlord_photo", "landlord_password", "landlord_proof", "landlord_vstatus", "place_id", "landlord_address") VALUES
	('5','Kim Taehyung','Male','9998887770','kth@gmail.com','2022-01-30','2022-02-10','Landlord_1808.jpg','kkk','LandlordProof_1443.jpg','0','1','aaaa
xxx
zzz');
/*!40000 ALTER TABLE "tbl_landlord" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_latestwork'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_latestwork" (
  "lwork_id" int(10) unsigned NOT NULL auto_increment,
  "lwork_image" varchar(50) default NULL,
  "lwork_amount" int(10) unsigned default NULL,
  "lwork_caption" varchar(100) default NULL,
  "lwork_details" varchar(500) default NULL,
  "worker_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("lwork_id"),
  UNIQUE KEY "lwork_id" ("lwork_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tbl_latestwork'
#

LOCK TABLES "tbl_latestwork" WRITE;
/*!40000 ALTER TABLE "tbl_latestwork" DISABLE KEYS;*/
REPLACE INTO "tbl_latestwork" ("lwork_id", "lwork_image", "lwork_amount", "lwork_caption", "lwork_details", "worker_id") VALUES
	('2','LatestWork_1516.jpg','100000','bts','gfgfgh 
                        ','2');
REPLACE INTO "tbl_latestwork" ("lwork_id", "lwork_image", "lwork_amount", "lwork_caption", "lwork_details", "worker_id") VALUES
	('3','LatestWork_1092.jpg','30000','work',' 
            gfjhg            ','5');
REPLACE INTO "tbl_latestwork" ("lwork_id", "lwork_image", "lwork_amount", "lwork_caption", "lwork_details", "worker_id") VALUES
	('4','LatestWork_1248.jpg','3500','rty',' ghjj
                        ','5');
REPLACE INTO "tbl_latestwork" ("lwork_id", "lwork_image", "lwork_amount", "lwork_caption", "lwork_details", "worker_id") VALUES
	('5','LatestWork_1993.jpg','4000','tyu',' hjkj
                        ','5');
/*!40000 ALTER TABLE "tbl_latestwork" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_location'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_location" (
  "location_id" int(10) unsigned NOT NULL auto_increment,
  "location_name" varchar(50) NOT NULL,
  "place_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("location_id"),
  UNIQUE KEY "location_id" ("location_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tbl_location'
#

LOCK TABLES "tbl_location" WRITE;
/*!40000 ALTER TABLE "tbl_location" DISABLE KEYS;*/
REPLACE INTO "tbl_location" ("location_id", "location_name", "place_id") VALUES
	('1','Marady','1');
REPLACE INTO "tbl_location" ("location_id", "location_name", "place_id") VALUES
	('2','Vengalloor','3');
REPLACE INTO "tbl_location" ("location_id", "location_name", "place_id") VALUES
	('3','Ponkunnam','2');
REPLACE INTO "tbl_location" ("location_id", "location_name", "place_id") VALUES
	('4','Thevara','6');
REPLACE INTO "tbl_location" ("location_id", "location_name", "place_id") VALUES
	('5','Kadavanthra','6');
/*!40000 ALTER TABLE "tbl_location" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_lworkbooking'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_lworkbooking" (
  "lworkbooking_id" int(10) unsigned NOT NULL auto_increment,
  "user_id" int(10) unsigned default NULL,
  "lwork_id" int(10) unsigned default NULL,
  "booking_date" date default NULL,
  "booked_date" date default NULL,
  "lworkbooking_pstatus" int(10) unsigned default '0',
  "lworkbooking_cstatus" int(10) unsigned default '0',
  PRIMARY KEY  ("lworkbooking_id"),
  UNIQUE KEY "workbooking_id" ("lworkbooking_id")
) AUTO_INCREMENT=11;



#
# Dumping data for table 'tbl_lworkbooking'
#

LOCK TABLES "tbl_lworkbooking" WRITE;
/*!40000 ALTER TABLE "tbl_lworkbooking" DISABLE KEYS;*/
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('2','3','3','2022-02-18','2022-02-26','0','3');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('3','3','3','2022-02-18','2022-02-26','0','0');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('4','1','2','2022-02-18','2022-02-26','1','3');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('5','1','2','2022-02-18','2022-02-25','0','2');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('6','1','2','2022-02-18','2022-02-24','0','0');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('7','1','2','2022-02-18','2022-03-16','1','3');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('8','1','2','2022-02-18','2022-02-28','0','0');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('9','3','4','2022-02-18','2022-02-28','0','0');
REPLACE INTO "tbl_lworkbooking" ("lworkbooking_id", "user_id", "lwork_id", "booking_date", "booked_date", "lworkbooking_pstatus", "lworkbooking_cstatus") VALUES
	('10','3','5','2022-02-18','2022-03-05','0','0');
/*!40000 ALTER TABLE "tbl_lworkbooking" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_place'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_place" (
  "place_id" int(10) unsigned NOT NULL auto_increment,
  "place_name" varchar(50) NOT NULL,
  "district_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("place_id"),
  UNIQUE KEY "place_id" ("place_id")
) AUTO_INCREMENT=8;



#
# Dumping data for table 'tbl_place'
#

LOCK TABLES "tbl_place" WRITE;
/*!40000 ALTER TABLE "tbl_place" DISABLE KEYS;*/
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('1','Muvattupuzha','1');
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('2','Pala','6');
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('3','Thodupuzha','5');
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('4','Eattumanoor','6');
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('5','Aluva','1');
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('6','Kochi','1');
REPLACE INTO "tbl_place" ("place_id", "place_name", "district_id") VALUES
	('7','Sulthan Batheri','8');
/*!40000 ALTER TABLE "tbl_place" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_product'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_product" (
  "product_id" int(10) unsigned NOT NULL auto_increment,
  "product_name" varchar(50) default NULL,
  "product_image" varchar(50) default NULL,
  "pcategory_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("product_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_product'
#

LOCK TABLES "tbl_product" WRITE;
/*!40000 ALTER TABLE "tbl_product" DISABLE KEYS;*/
REPLACE INTO "tbl_product" ("product_id", "product_name", "product_image", "pcategory_id") VALUES
	('2','Gas Stove','Product_1101.jpg','3');
REPLACE INTO "tbl_product" ("product_id", "product_name", "product_image", "pcategory_id") VALUES
	('3','TV','Product_2018.jpg','1');
/*!40000 ALTER TABLE "tbl_product" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_productcategory'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_productcategory" (
  "pcategory_id" int(10) unsigned NOT NULL auto_increment,
  "pcategory_name" varchar(50) default NULL,
  PRIMARY KEY  ("pcategory_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_productcategory'
#

LOCK TABLES "tbl_productcategory" WRITE;
/*!40000 ALTER TABLE "tbl_productcategory" DISABLE KEYS;*/
REPLACE INTO "tbl_productcategory" ("pcategory_id", "pcategory_name") VALUES
	('1','Home Appliances');
REPLACE INTO "tbl_productcategory" ("pcategory_id", "pcategory_name") VALUES
	('3','Kitchen Appliances');
/*!40000 ALTER TABLE "tbl_productcategory" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_review'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_review" (
  "review_id" int(10) unsigned NOT NULL auto_increment,
  "review_datetime" datetime default NULL,
  "user_id" int(10) unsigned default NULL,
  "user_rating" int(10) unsigned default NULL,
  "user_review" varchar(150) default NULL,
  "worker_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("review_id"),
  UNIQUE KEY "review_id" ("review_id")
);



#
# Dumping data for table 'tbl_review'
#

# No data found.



#
# Table structure for table 'tbl_service'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_service" (
  "service_id" int(10) unsigned NOT NULL auto_increment,
  "service_title" varchar(50) default NULL,
  "service_description" varchar(500) default NULL,
  "service_amount" int(10) unsigned default NULL,
  "worker_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("service_id"),
  UNIQUE KEY "service_id" ("service_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tbl_service'
#

LOCK TABLES "tbl_service" WRITE;
/*!40000 ALTER TABLE "tbl_service" DISABLE KEYS;*/
REPLACE INTO "tbl_service" ("service_id", "service_title", "service_description", "service_amount", "worker_id") VALUES
	('2','Plan','Plan Drawing
 
                        
                        ','1500','2');
REPLACE INTO "tbl_service" ("service_id", "service_title", "service_description", "service_amount", "worker_id") VALUES
	('3','Maping','bvhvbv 
                        ','2000','2');
REPLACE INTO "tbl_service" ("service_id", "service_title", "service_description", "service_amount", "worker_id") VALUES
	('4','construct',' 
      constructing                  ','25000','5');
REPLACE INTO "tbl_service" ("service_id", "service_title", "service_description", "service_amount", "worker_id") VALUES
	('5','work',' 
     working                   ','3000','5');
/*!40000 ALTER TABLE "tbl_service" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_servicebooking'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_servicebooking" (
  "servicebooking_id" int(10) unsigned NOT NULL auto_increment,
  "user_id" int(10) unsigned default NULL,
  "service_id" int(10) unsigned default NULL,
  "booking_date" date default NULL,
  "booked_date" date default NULL,
  "servicebooking_astatus" int(10) unsigned default '0',
  "servicebooking_pstatus" int(10) unsigned default '0',
  PRIMARY KEY  ("servicebooking_id"),
  UNIQUE KEY "servicebooking_id" ("servicebooking_id")
) AUTO_INCREMENT=5;



#
# Dumping data for table 'tbl_servicebooking'
#

LOCK TABLES "tbl_servicebooking" WRITE;
/*!40000 ALTER TABLE "tbl_servicebooking" DISABLE KEYS;*/
REPLACE INTO "tbl_servicebooking" ("servicebooking_id", "user_id", "service_id", "booking_date", "booked_date", "servicebooking_astatus", "servicebooking_pstatus") VALUES
	('1','3','5','2022-02-18','2022-02-28','3','1');
REPLACE INTO "tbl_servicebooking" ("servicebooking_id", "user_id", "service_id", "booking_date", "booked_date", "servicebooking_astatus", "servicebooking_pstatus") VALUES
	('3','1','4','2022-02-18','2022-03-26','3','1');
REPLACE INTO "tbl_servicebooking" ("servicebooking_id", "user_id", "service_id", "booking_date", "booked_date", "servicebooking_astatus", "servicebooking_pstatus") VALUES
	('4','1','5','2022-02-26','2022-02-09','3','1');
/*!40000 ALTER TABLE "tbl_servicebooking" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_servicegallery'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_servicegallery" (
  "sgallery_id" int(10) unsigned NOT NULL auto_increment,
  "sgallery_image" varchar(50) default NULL,
  "service_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("sgallery_id"),
  UNIQUE KEY "sgallery_id" ("sgallery_id")
) AUTO_INCREMENT=15;



#
# Dumping data for table 'tbl_servicegallery'
#

LOCK TABLES "tbl_servicegallery" WRITE;
/*!40000 ALTER TABLE "tbl_servicegallery" DISABLE KEYS;*/
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('3','Service_1253.jpg','3');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('4','Service_1746.jpg','3');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('5','Service_1596.jpg','2');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('6','Service_1788.jpg','2');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('8','Service_1700.jpg','2');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('9','Service_1884.jpg','4');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('10','Service_2052.jpg','4');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('11','Service_1762.jpg','5');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('12','Service_1737.jpg','5');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('13','Service_2009.jpg','4');
REPLACE INTO "tbl_servicegallery" ("sgallery_id", "sgallery_image", "service_id") VALUES
	('14','Service_1894.jpg','5');
/*!40000 ALTER TABLE "tbl_servicegallery" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_servicetype'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_servicetype" (
  "servicetype_id" int(10) unsigned NOT NULL auto_increment,
  "servicetype_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("servicetype_id"),
  UNIQUE KEY "servicetype_id" ("servicetype_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_servicetype'
#

LOCK TABLES "tbl_servicetype" WRITE;
/*!40000 ALTER TABLE "tbl_servicetype" DISABLE KEYS;*/
REPLACE INTO "tbl_servicetype" ("servicetype_id", "servicetype_name") VALUES
	('1','Pre booking');
/*!40000 ALTER TABLE "tbl_servicetype" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_shop'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_shop" (
  "shop_id" int(10) unsigned NOT NULL auto_increment,
  "shop_name" varchar(50) NOT NULL,
  "shop_email" varchar(50) NOT NULL,
  "shop_contact" varchar(50) default NULL,
  "shop_address" varchar(150) default NULL,
  "shop_logo" varchar(50) default NULL,
  "shop_proof" varchar(50) default NULL,
  "shop_password" varchar(50) default NULL,
  "shop_doj" date default NULL,
  "shop_vstatus" int(50) default '0',
  "place_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("shop_id"),
  UNIQUE KEY "shop_id" ("shop_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_shop'
#

LOCK TABLES "tbl_shop" WRITE;
/*!40000 ALTER TABLE "tbl_shop" DISABLE KEYS;*/
REPLACE INTO "tbl_shop" ("shop_id", "shop_name", "shop_email", "shop_contact", "shop_address", "shop_logo", "shop_proof", "shop_password", "shop_doj", "shop_vstatus", "place_id") VALUES
	('1','Rose','rose@gmail.com','9876543210','wesdrxfchg','Shop_2077.jpg','','rose','2022-03-10',1,'4');
REPLACE INTO "tbl_shop" ("shop_id", "shop_name", "shop_email", "shop_contact", "shop_address", "shop_logo", "shop_proof", "shop_password", "shop_doj", "shop_vstatus", "place_id") VALUES
	('2','jisoo','jisoo@gmail.com','9638527410',' fdsgfdsfhdfg                       ','Shop_1146.jpg','ShopProof_2086.jpg','jisoo','2022-03-10',1,'3');
/*!40000 ALTER TABLE "tbl_shop" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_shopproduct'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_shopproduct" (
  "sproduct_id" int(10) unsigned NOT NULL auto_increment,
  "shop_id" int(10) unsigned default NULL,
  "product_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("sproduct_id")
) AUTO_INCREMENT=12;



#
# Dumping data for table 'tbl_shopproduct'
#

LOCK TABLES "tbl_shopproduct" WRITE;
/*!40000 ALTER TABLE "tbl_shopproduct" DISABLE KEYS;*/
REPLACE INTO "tbl_shopproduct" ("sproduct_id", "shop_id", "product_id") VALUES
	('1','2','3');
REPLACE INTO "tbl_shopproduct" ("sproduct_id", "shop_id", "product_id") VALUES
	('2','2','2');
REPLACE INTO "tbl_shopproduct" ("sproduct_id", "shop_id", "product_id") VALUES
	('7','1','2');
REPLACE INTO "tbl_shopproduct" ("sproduct_id", "shop_id", "product_id") VALUES
	('10','1','3');
/*!40000 ALTER TABLE "tbl_shopproduct" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_sproductgallery'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_sproductgallery" (
  "gallery_id" int(10) unsigned NOT NULL auto_increment,
  "gallery_image" varchar(50) default NULL,
  "sproduct_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("gallery_id")
) AUTO_INCREMENT=5;



#
# Dumping data for table 'tbl_sproductgallery'
#

LOCK TABLES "tbl_sproductgallery" WRITE;
/*!40000 ALTER TABLE "tbl_sproductgallery" DISABLE KEYS;*/
REPLACE INTO "tbl_sproductgallery" ("gallery_id", "gallery_image", "sproduct_id") VALUES
	('1','ProductGallery_999.jpg','2');
REPLACE INTO "tbl_sproductgallery" ("gallery_id", "gallery_image", "sproduct_id") VALUES
	('2','ProductGallery_1324.jpg','2');
REPLACE INTO "tbl_sproductgallery" ("gallery_id", "gallery_image", "sproduct_id") VALUES
	('3','ProductGallery_1111.png','2');
REPLACE INTO "tbl_sproductgallery" ("gallery_id", "gallery_image", "sproduct_id") VALUES
	('4','ProductGallery_1130.jpeg','1');
/*!40000 ALTER TABLE "tbl_sproductgallery" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_sproductstock'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_sproductstock" (
  "sproductstock_id" int(10) unsigned NOT NULL auto_increment,
  "sproduct_id" int(10) unsigned default NULL,
  "sproduct_qty" int(10) unsigned default NULL,
  PRIMARY KEY  ("sproductstock_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_sproductstock'
#

LOCK TABLES "tbl_sproductstock" WRITE;
/*!40000 ALTER TABLE "tbl_sproductstock" DISABLE KEYS;*/
REPLACE INTO "tbl_sproductstock" ("sproductstock_id", "sproduct_id", "sproduct_qty") VALUES
	('1','2','10');
REPLACE INTO "tbl_sproductstock" ("sproductstock_id", "sproduct_id", "sproduct_qty") VALUES
	('2','1','20');
/*!40000 ALTER TABLE "tbl_sproductstock" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_user'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_user" (
  "user_id" int(10) unsigned NOT NULL auto_increment,
  "user_name" varchar(50) NOT NULL,
  "user_contact" varchar(50) default NULL,
  "user_email" varchar(50) default NULL,
  "user_gender" varchar(50) default NULL,
  "user_address" varchar(150) default NULL,
  "user_dob" date default NULL,
  "user_doj" date default NULL,
  "user_photo" varchar(50) default NULL,
  "user_password" varchar(50) default NULL,
  "location_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("user_id"),
  UNIQUE KEY "user_id" ("user_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_user'
#

LOCK TABLES "tbl_user" WRITE;
/*!40000 ALTER TABLE "tbl_user" DISABLE KEYS;*/
REPLACE INTO "tbl_user" ("user_id", "user_name", "user_contact", "user_email", "user_gender", "user_address", "user_dob", "user_doj", "user_photo", "user_password", "location_id") VALUES
	('1','Kim Taehyung','9998887775','kth@gmail.com','Male','aaaa
xxx
zzz
                        
                        
                        
                        
                        
    ','1995-12-30',NULL,'User_2089.jpg','kth','1');
REPLACE INTO "tbl_user" ("user_id", "user_name", "user_contact", "user_email", "user_gender", "user_address", "user_dob", "user_doj", "user_photo", "user_password", "location_id") VALUES
	('3','Ardra Jiji','9638527410','ardrajiji@gmail.com','Female',' sdfghjkl                       ','2002-02-22','2022-02-05','User_2003.jpg','ardra','1');
/*!40000 ALTER TABLE "tbl_user" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_wishlist'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_wishlist" (
  "wishlist_id" int(10) unsigned NOT NULL auto_increment,
  "user_id" int(10) unsigned default NULL,
  "worker_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("wishlist_id"),
  UNIQUE KEY "wishlist_id" ("wishlist_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_wishlist'
#

LOCK TABLES "tbl_wishlist" WRITE;
/*!40000 ALTER TABLE "tbl_wishlist" DISABLE KEYS;*/
REPLACE INTO "tbl_wishlist" ("wishlist_id", "user_id", "worker_id") VALUES
	('1','1','2');
REPLACE INTO "tbl_wishlist" ("wishlist_id", "user_id", "worker_id") VALUES
	('2','1','5');
/*!40000 ALTER TABLE "tbl_wishlist" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_work'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_work" (
  "work_id" int(10) unsigned NOT NULL auto_increment,
  "work_image" varchar(50) default NULL,
  "work_caption" varchar(100) default NULL,
  "worker_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("work_id"),
  UNIQUE KEY "work_id" ("work_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_work'
#

LOCK TABLES "tbl_work" WRITE;
/*!40000 ALTER TABLE "tbl_work" DISABLE KEYS;*/
REPLACE INTO "tbl_work" ("work_id", "work_image", "work_caption", "worker_id") VALUES
	('3','Work_1802.jpg','1st work','2');
/*!40000 ALTER TABLE "tbl_work" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_worker'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_worker" (
  "worker_id" int(10) unsigned NOT NULL auto_increment,
  "worker_name" varchar(50) NOT NULL,
  "worker_contact" varchar(50) default NULL,
  "worker_gender" varchar(50) default NULL,
  "worker_email" varchar(50) default NULL,
  "worker_address" varchar(150) default NULL,
  "worker_dob" date default NULL,
  "worker_photo" varchar(50) default NULL,
  "worker_proof" varchar(50) default NULL,
  "worker_vstatus" int(10) unsigned default '0',
  "worker_password" varchar(50) default NULL,
  "worker_doj" date default NULL,
  "workertype_id" int(10) unsigned default NULL,
  "place_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("worker_id"),
  UNIQUE KEY "worker_id" ("worker_id")
) AUTO_INCREMENT=8;



#
# Dumping data for table 'tbl_worker'
#

LOCK TABLES "tbl_worker" WRITE;
/*!40000 ALTER TABLE "tbl_worker" DISABLE KEYS;*/
REPLACE INTO "tbl_worker" ("worker_id", "worker_name", "worker_contact", "worker_gender", "worker_email", "worker_address", "worker_dob", "worker_photo", "worker_proof", "worker_vstatus", "worker_password", "worker_doj", "workertype_id", "place_id") VALUES
	('1','Anjana Santhosh','9999999999','Female','as.anjanasanthosh@gmail.com','dhgcfxgdhf','2001-09-29','WorkerProof_1826.jpg','WorkerProof_1826.jpg','1','anjana',NULL,'1','1');
REPLACE INTO "tbl_worker" ("worker_id", "worker_name", "worker_contact", "worker_gender", "worker_email", "worker_address", "worker_dob", "worker_photo", "worker_proof", "worker_vstatus", "worker_password", "worker_doj", "workertype_id", "place_id") VALUES
	('2','Ayaan','9898989899','Male','ayaan@gmail.com','sdxssdxa                  
                        
                        
                        
                        
                  ','1995-10-18','Worker_1268.jpg','WorkerProof_1560.jpg','1','ayaan',NULL,'1','1');
REPLACE INTO "tbl_worker" ("worker_id", "worker_name", "worker_contact", "worker_gender", "worker_email", "worker_address", "worker_dob", "worker_photo", "worker_proof", "worker_vstatus", "worker_password", "worker_doj", "workertype_id", "place_id") VALUES
	('3','Jeon Jungkook','9876543210','Male','jjk@gmail.com','aaaa
xxx
zzz','1995-12-30','Worker_1412.jpg','WorkerProof_1938.jpg','1','jjk',NULL,'2','2');
REPLACE INTO "tbl_worker" ("worker_id", "worker_name", "worker_contact", "worker_gender", "worker_email", "worker_address", "worker_dob", "worker_photo", "worker_proof", "worker_vstatus", "worker_password", "worker_doj", "workertype_id", "place_id") VALUES
	('5','Karthika Santhosh','9898989898','Female','karthikasanthosh2002@gmail.com','aqeffZGQFEASFEGASDF                  ','2022-02-16','Worker_1903.jpg','WorkerProof_1016.jpg','1','asdf','2022-02-05','2','1');
REPLACE INTO "tbl_worker" ("worker_id", "worker_name", "worker_contact", "worker_gender", "worker_email", "worker_address", "worker_dob", "worker_photo", "worker_proof", "worker_vstatus", "worker_password", "worker_doj", "workertype_id", "place_id") VALUES
	('7','Suraj K S','9898989898','Male','surajks28101999@gmail.com','       HUvghbijdfbdfh                 ','2022-02-01','Worker_1943.jpg','WorkerProof_1697.jpg','0','Surajks@28101999','2022-02-05','1','1');
/*!40000 ALTER TABLE "tbl_worker" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_workertype'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_workertype" (
  "workertype_id" int(10) unsigned NOT NULL auto_increment,
  "workertype_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("workertype_id"),
  UNIQUE KEY "workertype_id" ("workertype_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_workertype'
#

LOCK TABLES "tbl_workertype" WRITE;
/*!40000 ALTER TABLE "tbl_workertype" DISABLE KEYS;*/
REPLACE INTO "tbl_workertype" ("workertype_id", "workertype_name") VALUES
	('1','Astrologist');
REPLACE INTO "tbl_workertype" ("workertype_id", "workertype_name") VALUES
	('2','Architect');
/*!40000 ALTER TABLE "tbl_workertype" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_workgallery'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_workgallery" (
  "wgallery_id" int(10) unsigned NOT NULL auto_increment,
  "wgallery_image" varchar(50) default NULL,
  "work_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("wgallery_id"),
  UNIQUE KEY "wgallery_id" ("wgallery_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tbl_workgallery'
#

LOCK TABLES "tbl_workgallery" WRITE;
/*!40000 ALTER TABLE "tbl_workgallery" DISABLE KEYS;*/
REPLACE INTO "tbl_workgallery" ("wgallery_id", "wgallery_image", "work_id") VALUES
	('3','WorkGallery_1086.jpg','3');
/*!40000 ALTER TABLE "tbl_workgallery" ENABLE KEYS;*/
UNLOCK TABLES;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
