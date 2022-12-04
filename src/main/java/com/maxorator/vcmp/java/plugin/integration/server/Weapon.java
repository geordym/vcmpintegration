package com.maxorator.vcmp.java.plugin.integration.server;

public abstract class Weapon {

    public static int UNARMED = 0;
    public static int BRASSKNUCKLES = 1;
    public static int SCREWDRIVER = 2;
    public static int GOLFCLUB = 3;
    public static int NIGHTSTICK = 4;
    public static int KNIFE = 5;
    public static int BASEBALLBAT = 6;
    public static int HAMMER = 7;
    public static int MEATCLEAVER = 8;
    public static int MACHETE = 9;
    public static int KATANA = 10;
    public static int CHAINSAW = 11;
    public static int GRENADE = 12;
    public static int REMOTE = 13;
    public static int TEARGAS = 14;
    public static int MOLOTOV = 15;
    public static int ROCKET = 16;
    public static int COLT45 = 17;
    public static int PYTHON = 18;
    public static int SHOTGUN = 19;
    public static int SPAS12 = 20;
    public static int STUBBY = 21;
    public static int TEC9 = 22;
    public static int UZI = 23;
    public static int INGRAM = 24;
    public static int MP5 = 25;
    public static int M4 = 26;
    public static int RUGER = 27;
    public static int SNIPER = 28;
    public static int LASERSCOPE = 29;
    public static int ROCKETLAUNCHER = 30;
    public static int FLAMETHROWER = 31;
    public static int M60 = 32;
    public static int MINIGUN = 33;
    public static int BOMB = 34;
    public static int CAMERA = 36;

    private static final String[] weps = new String[]{
        "Fist", "BrassKnuckle", "ScrewDriver",
        "GolfClub", "NightStick", "Knife",
        "BaseballBat", "Hammer", "Cleaver",
        "Machete", "Katana", "Chainsaw",
        "Grenade", "RemoteGrenade",
        "TearGas", "Molotov", "Missile",
        "Colt45", "Python", "Shotgun",
        "Spaz", "Stubby",
        "Tec9", "Uzi", "Ingrams", "MP5",
        "M4", "Ruger", "SniperRifle",
        "LaserScope", "RocketLauncher",
        "FlameThrower", "M60", "Minigun",
        "Bomb", "Helicannon", "Camera", "", "",
        "Vehicle", "", "Explosion", "Drive-by", "Drowned",
        "Fell", "", "", "", "", "", "", "Explosion",
        "", "", "", "", "", "", "", "",
        "", "", "", "", "", "", "",
        "", "", "", "Suicide"
    };

    public static String getWeaponNameByID(Integer id) {
        if (id == null) {
            return "";
        }
        if (id < weps.length || id > weps.length) {
            return "";
        }
        return weps[id];
    }


}
