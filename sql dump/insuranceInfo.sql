--------------------------------------------------------
--  File created - Thursday-October-18-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table INSURANCE_INFO_AS
--------------------------------------------------------

  CREATE TABLE "TRAINING"."INSURANCE_INFO_AS" 
   (	"REGNO" VARCHAR2(12 BYTE), 
	"POLICYNO" VARCHAR2(5 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING" ;
REM INSERTING into TRAINING.INSURANCE_INFO_AS
SET DEFINE OFF;
Insert into TRAINING.INSURANCE_INFO_AS (REGNO,POLICYNO) values ('1234','a1');
--------------------------------------------------------
--  DDL for Index SYS_C0095225
--------------------------------------------------------

  CREATE UNIQUE INDEX "TRAINING"."SYS_C0095225" ON "TRAINING"."INSURANCE_INFO_AS" ("REGNO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING" ;
--------------------------------------------------------
--  DDL for Index SYS_C0095226
--------------------------------------------------------

  CREATE UNIQUE INDEX "TRAINING"."SYS_C0095226" ON "TRAINING"."INSURANCE_INFO_AS" ("POLICYNO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING" ;
--------------------------------------------------------
--  Constraints for Table INSURANCE_INFO_AS
--------------------------------------------------------

  ALTER TABLE "TRAINING"."INSURANCE_INFO_AS" MODIFY ("POLICYNO" NOT NULL ENABLE);
 
  ALTER TABLE "TRAINING"."INSURANCE_INFO_AS" ADD PRIMARY KEY ("REGNO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING"  ENABLE;
 
  ALTER TABLE "TRAINING"."INSURANCE_INFO_AS" ADD UNIQUE ("POLICYNO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "TRAINING"  ENABLE;