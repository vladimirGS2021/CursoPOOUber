<?php
require_once("car.php");
require_once("uberx.ptp");
require_once("uberk.ptp");
require_once("user.ptp");
require_once("account.php");
$car = new car ("KOILA123", new Account("Gonzalo
Rivera", "ASD12369", "gonzalo@latzi.pe", "1253698"));
$car->printDatacar();
$uberX = new Uberx("ASHA1258", new Account ("Rolando
Villa", "PÑLOI3256", "rolando@platzi.pe", "1255633"),
"Toyota", "Corolla");
$uberx->printDatauberX();
$user = new User ("Mario villa", "SDF125369",
"mario@platzi.pe", "4523699");
Suser->printDatauser();
?>