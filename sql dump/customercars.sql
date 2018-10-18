--------------------------------------------------------
--  File created - Thursday-October-18-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CUSTOMER_CARS_AS
--------------------------------------------------------

  CREATE TABLE "TRAINING"."CUSTOMER_CARS_AS" 
   (	"CID" NUMBER, 
	"REGNO" VARCHAR2(12 BYTE), 
	"MODELNAME" VARCHAR2(25 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING" ;
REM INSERTING into TRAINING.CUSTOMER_CARS_AS
SET DEFINE OFF;
Insert into TRAINING.CUSTOMER_CARS_AS (CID,REGNO,MODELNAME) values (21,'1234','CXA');
--------------------------------------------------------
--  DDL for Index SYS_C0095243
--------------------------------------------------------

  CREATE UNIQUE INDEX "TRAINING"."SYS_C0095243" ON "TRAINING"."CUSTOMER_CARS_AS" ("REGNO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING" ;
--------------------------------------------------------
--  Constraints for Table CUSTOMER_CARS_AS
--------------------------------------------------------

  ALTER TABLE "TRAINING"."CUSTOMER_CARS_AS" ADD PRIMARY KEY ("REGNO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CUSTOMER_CARS_AS
--------------------------------------------------------

  ALTER TABLE "TRAINING"."CUSTOMER_CARS_AS" ADD FOREIGN KEY ("CID")
	  REFERENCES "TRAINING"."SERVICE_CUSTOMER_AS" ("CID") ENABLE;
