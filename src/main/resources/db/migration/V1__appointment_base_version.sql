-- MySQL Workbench Synchronization
-- Generated: 2018-08-14 00:19
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: AswinKumar

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE TABLE IF NOT EXISTS `appointment_db`.`appointment` (
  `appointment_id` INT(11) NOT NULL AUTO_INCREMENT,
  `appointment_date` VARCHAR(150) NULL DEFAULT NULL,
  `appointment_description` VARCHAR(150) NULL DEFAULT NULL,
  `hospital_name` VARCHAR(150) NULL DEFAULT NULL,
  `appointment_from_time` VARCHAR(150) NULL DEFAULT NULL,
  `appointment_to_time` VARCHAR(150) NULL DEFAULT NULL,
  PRIMARY KEY (`appointment_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO `appointment_db`.`appointment` (`appointment_id`, `appointment_date`, `appointment_description`, `hospital_name`, `appointment_from_time`, `appointment_to_time`) VALUES ('1', '07/13/2018', 'Dental appointment', 'Apollo Hospital', '8:15AM', '9:15AM');
INSERT INTO `appointment_db`.`appointment` (`appointment_id`, `appointment_date`, `appointment_description`, `hospital_name`, `appointment_from_time`, `appointment_to_time`) VALUES ('2', '07/13/2018', 'ENT appointment', 'VCare Hospital', '10:00AM', '11:00AM');
INSERT INTO `appointment_db`.`appointment` (`appointment_id`, `appointment_date`, `appointment_description`, `hospital_name`, `appointment_from_time`, `appointment_to_time`) VALUES ('3', '07/13/2018', 'General checkup', 'VCare Hospital', '5:00PM', '5:30PM');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
