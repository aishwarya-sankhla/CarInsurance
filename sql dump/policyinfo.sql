--------------------------------------------------------
--  File created - Thursday-October-18-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table POLICY_INFO_AS
--------------------------------------------------------

  CREATE TABLE "TRAINING"."POLICY_INFO_AS" 
   (	"POLICYNO" VARCHAR2(5 BYTE), 
	"INSURANCE_TYPE" VARCHAR2(15 BYTE), 
	"CAR_MODEL" VARCHAR2(25 BYTE), 
	"MAX_COVERAGE" NUMBER, 
	"EXPIRY" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING" ;
REM INSERTING into TRAINING.POLICY_INFO_AS
SET DEFINE OFF;
Insert into TRAINING.POLICY_INFO_AS (POLICYNO,INSURANCE_TYPE,CAR_MODEL,MAX_COVERAGE,EXPIRY) values ('a1','bumper','crv',7800,'12/12/2022');
--------------------------------------------------------
--  Constraints for Table POLICY_INFO_AS
--------------------------------------------------------

  ALTER TABLE "TRAINING"."POLICY_INFO_AS" MODIFY ("INSURANCE_TYPE" NOT NULL ENABLE);
 
  ALTER TABLE "TRAINING"."POLICY_INFO_AS" MODIFY ("CAR_MODEL" NOT NULL ENABLE);
 
  ALTER TABLE "TRAINING"."POLICY_INFO_AS" MODIFY ("MAX_COVERAGE" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table POLICY_INFO_AS
--------------------------------------------------------

  ALTER TABLE "TRAINING"."POLICY_INFO_AS" ADD FOREIGN KEY ("POLICYNO")
	  REFERENCES "TRAINING"."INSURANCE_INFO_AS" ("POLICYNO") ENABLE;
 
  ALTER TABLE "TRAINING"."POLICY_INFO_AS" ADD FOREIGN KEY ("INSURANCE_TYPE")
	  REFERENCES "TRAINING"."TYPE_INFO_AS" ("INSURANCE_TYPE") ENABLE;
