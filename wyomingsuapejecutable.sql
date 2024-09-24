-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema `wyomingsuap`
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `wyomingsuap` DEFAULT CHARACTER SET utf8 ;
USE `wyomingsuap` ;

-- -----------------------------------------------------
-- Table `wyomingsuap`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wyomingsuap`.`administrador` (
  `idAdministrador` INT(11) NOT NULL,
  `nombreAdministrador` VARCHAR(255) DEFAULT NULL,
  `Contrasena` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`idAdministrador`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `wyomingsuap`.`profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wyomingsuap`.`profesor` (
  `idProfesor` INT(11) NOT NULL,
  `nombre` VARCHAR(255) DEFAULT NULL,
  `apellido` VARCHAR(255) DEFAULT NULL,
  `RFC` INT(11) DEFAULT NULL,
  PRIMARY KEY (`idProfesor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `wyomingsuap`.`unidad_de_aprendizaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `wyomingsuap`.`unidad_de_aprendizaje` (
  `idUnidadAprendizaje` INT(11) NOT NULL,
  `nombreDeLaUnidadAprendisaje` VARCHAR(255) DEFAULT NULL,
  `horaClase` TIME DEFAULT NULL,
  `horaTaller` TIME DEFAULT NULL,
  `horasLaboratorio` TIME DEFAULT NULL,
  PRIMARY KEY (`idUnidadAprendizaje`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- Final adjustments
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
