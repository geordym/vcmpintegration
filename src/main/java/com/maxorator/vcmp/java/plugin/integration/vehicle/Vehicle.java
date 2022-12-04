package com.maxorator.vcmp.java.plugin.integration.vehicle;

import com.maxorator.vcmp.java.plugin.integration.generic.Entity;
import com.maxorator.vcmp.java.plugin.integration.generic.Quaternion;
import com.maxorator.vcmp.java.plugin.integration.generic.Rotation2d;
import com.maxorator.vcmp.java.plugin.integration.generic.Vector;
import com.maxorator.vcmp.java.plugin.integration.player.Player;

@SuppressWarnings("unused")
public interface Vehicle extends Entity {

    public static int LANDSTALKER = 130;
    public static int IDAHO = 131;
    public static int STINGER = 132;
    public static int LINERUNNER = 133;
    public static int PERENNIAL = 134;
    public static int SENTINEL = 135;
    public static int RIO = 136;
    public static int FIRETRUCK = 137;
    public static int TRASHMASTER = 138;
    public static int STRETCH = 139;
    public static int MANANA = 140;
    public static int INFERNUS = 141;
    public static int VOODOO = 142;
    public static int PONY = 143;
    public static int MULE = 144;
    public static int CHEETAH = 145;
    public static int AMBULANCE = 146;
    public static int FBIWASHINGTON = 147;
    public static int MOONBEAM = 148;
    public static int ESPERANTO = 149;
    public static int TAXI = 150;
    public static int WASHINGTON = 151;
    public static int BOBCAT = 152;
    public static int MRWHOOPEE = 153;
    public static int BFINJECTION = 154;
    public static int HUNTER = 155;
    public static int POLICE = 156;
    public static int ENFORCER = 157;
    public static int SECURICAR = 158;
    public static int BANSHEE = 159;
    public static int PREDATOR = 160;
    public static int BUS = 161;
    public static int RHINO = 162;
    public static int BARRACKSOL = 163;
    public static int BARRACKS = 163;
    public static int CUBANHERMES = 164;
    public static int HELICOPTER = 165;
    public static int ANGEL = 166;
    public static int COACH = 167;
    public static int CABBIE = 168;
    public static int STALLION = 169;
    public static int RUMPO = 170;
    public static int RCBANDIT = 171;
    public static int HEARSE = 172;
    public static int PACKER = 173;
    public static int SENTINELXS = 174;
    public static int ADMIRAL = 175;
    public static int SQUALO = 176;
    public static int SEASPARROW = 177;
    public static int PIZZABOY = 178;
    public static int GANGBURRITO = 179;
    public static int AIRTRAIN = 180;
    public static int DEADDODO = 181;
    public static int SPEEDER = 182;
    public static int REEFER = 183;
    public static int TROPIC = 184;
    public static int FLATBED = 185;
    public static int YANKEE = 186;
    public static int CADDY = 187;
    public static int ZEBRA = 188;
    public static int TOPFUN = 189;
    public static int SKIMMER = 190;
    public static int PCJ = 191;
    public static int FAGGIO = 192;
    public static int FREEWAY = 193;
    public static int RCBARON = 194;
    public static int RCRAIDER = 195;
    public static int GLENDALE = 196;
    public static int OCEANIC = 197;
    public static int SANCHEZ = 198;
    public static int SPARROW = 199;
    public static int PATRIOT = 200;
    public static int LOVEFIST = 201;
    public static int COASTGUARD = 202;
    public static int DINGHY = 203;
    public static int HERMES = 204;
    public static int SABRE = 205;
    public static int SABRETURBO = 206;
    public static int PHOENIX = 207;
    public static int WALTON = 208;
    public static int REGINA = 209;
    public static int COMET = 210;
    public static int DELUXO = 211;
    public static int BURRITO = 212;
    public static int SPANDEXPRESSVAN = 213;
    public static int MARQUIS = 214;
    public static int BAGGAGE = 215;
    public static int KAUFMAN = 216;
    public static int MAVERICK = 217;
    public static int MAVERICKVCN = 218;
    public static int RANCHER = 219;
    public static int FBIRANCHER = 220;
    public static int VIRGO = 221;
    public static int GREENWOOD = 222;
    public static int CUBANJETMAX = 223;
    public static int HOTRING1 = 224;
    public static int SANDKING = 225;
    public static int BLISTA = 226;
    public static int POLICEMAVERICK = 227;
    public static int BOXVILLE = 228;
    public static int BENSON = 229;
    public static int MESA = 230;
    public static int RCGOBLIN = 231;
    public static int HOTRING2 = 232;
    public static int HOTRING3 = 233;
    public static int BLOODRING1 = 234;
    public static int BLOODRING2 = 235;
    public static int CHEETAHFBI = 236;

    void delete();

    Player getSyncController();

    VehicleSyncReason getSyncReason();

    int getSyncReasonOrdinal();

    boolean isStreamedForPlayer(Player player);

    void setWorld(int worldId);

    int getWorld();

    int getLightsData();

    void setLightsData(int val);

    int getModel();

    void setTaxiLight(boolean b);

    boolean getTaxiLight();

    Player getOccupant(int slot);

    float getBasicAngle();

    Vector getPositionInfront(float distance);

    void respawn();

    void setImmunities(VehicleImmunity vehicleImmunity);

    void setImmunityFlags(int flags);

    VehicleImmunity getImmunities();

    int getImmunityFlags();

    void detonate();

    boolean isWrecked();

    void setPosition(Vector position);

    void setPosition(float x, float y, float z);

    Vector getPosition();

    void setRotation(Quaternion rotation);

    void setRotation(float x, float y, float z, float w);

    Quaternion getRotation();

    void setRotation(Vector rotation);

    void setRotationEuler(float x, float y, float z);

    Vector getRotationEuler();

    void setSpeed(Vector speed, boolean add, boolean relative);

    void setSpeed(float x, float y, float z, boolean add, boolean relative);

    Vector getSpeed(boolean relative);

    void setTurnSpeed(Vector speed, boolean add, boolean relative);

    void setTurnSpeed(float x, float y, float z, boolean add, boolean relative);

    Vector getTurnSpeed(boolean relative);

    void setSpawnPosition(Vector position);

    void setSpawnPosition(float x, float y, float z);

    Vector getSpawnPosition();

    void setSpawnRotation(Quaternion rotation);

    void setSpawnRotation(float x, float y, float z, float w);

    Quaternion getSpawnRotation();

    void setSpawnRotation(Vector rotation);

    void setSpawnRotationEuler(float x, float y, float z);

    Vector getSpawnRotationEuler();

    //  void set3DArrowForPlayer(Player player, boolean hasArrow);
    //  boolean has3DArrowForPlayer(Player player);
    void setIdleRespawnTimeout(int millis);

    int getIdleRespawnTimeout();

    void setHealth(float health);

    float getHealth();

    void setColours(VehicleColours colours);

    void setColours(int primary, int secondary);

    VehicleColours getColours();

    void setOption(VehicleOption setting, boolean value);

    void setOption(int settingId, boolean value);

    boolean getOption(VehicleOption setting);

    boolean getOption(int settingId);

    VehicleDamage getDamage();

    int getDamageHex();

    void setDamage(VehicleDamage damage);

    void setDamage(int damageHex);

    void setRadio(int radioId);

    int getRadio();

    Rotation2d getTurrentRotation();

    boolean handlingRuleExists(HandlingRule rule);

    boolean handlingRuleExists(int ruleIndex);

    void setHandlingRule(HandlingRule rule, double value);

    void setHandlingRule(int ruleIndex, double value);

    double getHandlingRule(HandlingRule rule);

    double getHandlingRule(int ruleIndex);

    void resetHandlingRule(HandlingRule rule);

    void resetHandlingRule(int ruleIndex);

    void resetHandling();
}
