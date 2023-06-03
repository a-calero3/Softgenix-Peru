-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema malibubd
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema malibubd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `malibubd` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `malibubd` ;

-- -----------------------------------------------------
-- Table `malibubd`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`categoria` (
  `id_categoria` INT NOT NULL,
  `nombre_categoria` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`usuario` (
  `id_usuario` INT NOT NULL,
  `nombre_usuario` VARCHAR(50) NULL DEFAULT NULL,
  `correo_electronico` VARCHAR(50) NULL DEFAULT NULL,
  `contrasena` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`reporte_inventario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`reporte_inventario` (
  `id_reporte_inventario` INT NOT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `id_usuario` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_reporte_inventario`),
  INDEX `id_usuario` (`id_usuario` ASC) VISIBLE,
  CONSTRAINT `reporte_inventario_ibfk_1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `malibubd`.`usuario` (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`producto` (
  `id_producto` INT NOT NULL,
  `nombre_producto` VARCHAR(50) NULL DEFAULT NULL,
  `descripcion` VARCHAR(200) NULL DEFAULT NULL,
  `id_categoria` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_producto`),
  INDEX `id_categoria` (`id_categoria` ASC) VISIBLE,
  CONSTRAINT `producto_ibfk_1`
    FOREIGN KEY (`id_categoria`)
    REFERENCES `malibubd`.`categoria` (`id_categoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`historial_reportes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`historial_reportes` (
  `id_historial_reportes` INT NOT NULL,
  `id_reporte_inventario` INT NULL DEFAULT NULL,
  `id_producto` INT NULL DEFAULT NULL,
  `cantidad` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_historial_reportes`),
  INDEX `id_reporte_inventario` (`id_reporte_inventario` ASC) VISIBLE,
  INDEX `id_producto` (`id_producto` ASC) VISIBLE,
  CONSTRAINT `historial_reportes_ibfk_1`
    FOREIGN KEY (`id_reporte_inventario`)
    REFERENCES `malibubd`.`reporte_inventario` (`id_reporte_inventario`),
  CONSTRAINT `historial_reportes_ibfk_2`
    FOREIGN KEY (`id_producto`)
    REFERENCES `malibubd`.`producto` (`id_producto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`proveedor` (
  `id_proveedor` INT NOT NULL,
  `nombre_proveedor` VARCHAR(50) NULL DEFAULT NULL,
  `direccion` VARCHAR(100) NULL DEFAULT NULL,
  `telefono` VARCHAR(20) NULL DEFAULT NULL,
  `email` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`materiaprima`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`materiaprima` (
  `id_materia_prima` INT NOT NULL,
  `nombre_materia_prima` VARCHAR(50) NULL DEFAULT NULL,
  `proveedor_id_proveedor` INT NOT NULL,
  PRIMARY KEY (`id_materia_prima`),
  INDEX `fk_materiaprima_proveedor1_idx` (`proveedor_id_proveedor` ASC) VISIBLE,
  CONSTRAINT `fk_materiaprima_proveedor1`
    FOREIGN KEY (`proveedor_id_proveedor`)
    REFERENCES `malibubd`.`proveedor` (`id_proveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`producto_detalles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`producto_detalles` (
  `id_producto` INT NOT NULL,
  `id_materia_prima` INT NOT NULL,
  `cantidad` INT NULL DEFAULT NULL,
  `precio` DECIMAL(10,2) NULL DEFAULT NULL,
  PRIMARY KEY (`id_producto`, `id_materia_prima`),
  INDEX `id_materia_prima` (`id_materia_prima` ASC) VISIBLE,
  CONSTRAINT `producto_detalles_ibfk_1`
    FOREIGN KEY (`id_producto`)
    REFERENCES `malibubd`.`producto` (`id_producto`),
  CONSTRAINT `producto_detalles_ibfk_2`
    FOREIGN KEY (`id_materia_prima`)
    REFERENCES `malibubd`.`materiaprima` (`id_materia_prima`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`rol` (
  `id_rol` INT NOT NULL,
  `nombre_rol` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id_rol`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `malibubd`.`usuario_rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `malibubd`.`usuario_rol` (
  `id_usuario_rol` INT NOT NULL,
  `id_usuario` INT NULL DEFAULT NULL,
  `id_rol` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_usuario_rol`),
  INDEX `id_usuario` (`id_usuario` ASC) VISIBLE,
  INDEX `id_rol` (`id_rol` ASC) VISIBLE,
  CONSTRAINT `usuario_rol_ibfk_1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `malibubd`.`usuario` (`id_usuario`),
  CONSTRAINT `usuario_rol_ibfk_2`
    FOREIGN KEY (`id_rol`)
    REFERENCES `malibubd`.`rol` (`id_rol`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;