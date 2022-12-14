package com.maxorator.vcmp.java.plugin.integration.player;

import com.maxorator.vcmp.java.plugin.integration.generic.Colour;
import com.maxorator.vcmp.java.plugin.integration.generic.EntityImpl;
import com.maxorator.vcmp.java.plugin.integration.generic.Vector;
import com.maxorator.vcmp.java.plugin.integration.placeable.GameObject;
import com.maxorator.vcmp.java.plugin.integration.server.NetworkStatisticOption;
import com.maxorator.vcmp.java.plugin.integration.vehicle.Vehicle;

@SuppressWarnings("unused")
public class PlayerImpl extends EntityImpl implements Player {

    protected PlayerImpl(int id) {
        super(id);
    }

    @Override
    public native boolean isAdmin();

    @Override
    public native void setAdmin(boolean isAdmin);

    @Override
    public native String getIP();

    @Override
    public native void kick();

    @Override
    public native void ban();

    @Override
    public native boolean isSpawned();

    @Override
    public native boolean isStreamedForPlayer(Player player);

    @Override
    public native long getUniqueId();

    @Override
    public native void setWorld(int worldId);

    @Override
    public native int getWorld();

    @Override
    public native void setSecondaryWorld(int worldId);

    @Override
    public native int getSecondaryWorld();

    @Override
    public native int getUniqueWorld();

    @Override
    public native boolean isCompatibleWithWorld(int worldId);

    @Override
    public native int getState();

    @Override
    public native String getName();

    @Override
    public native boolean setName(String name);

    @Override
    public native void setTeam(int teamId);

    @Override
    public native int getTeam();

    @Override
    public native void setSkin(int skinId);

    @Override
    public native int getSkin();

    @Override
    public void setColour(Colour colour) {
        setColour(colour.getHex());
    }

    @Override
    public native void setColour(int colour);

    @Override
    public Vector getPositionInfront(float distance) {
        float newX = (float) (this.getPosition().x - distance * Math.sin(this.getHeading()));
        float newY = (float) (this.getPosition().y + distance * Math.cos(this.getHeading()));
        return new Vector(newX, newY, this.getPosition().z);
    }

    @Override
    public Colour getColour() {
        return new Colour(getColourHex());
    }

    @Override
    public native int getColourHex();

    @Override
    public native void forceSpawn();

    @Override
    public native void forceSelect();

    @Override
    public native void giveMoney(int amount);

    @Override
    public native void setMoney(int amount);

    @Override
    public native int getMoney();

    @Override
    public native void setScore(int score);

    @Override
    public native int getScore();

    @Override
    public native int getPing();

    @Override
    public native boolean isTyping();

    @Override
    public native double getFPS();

    @Override
    public native String getUID();

    @Override
    public native String getUID2();

    @Override
    public native void setHealth(float health);

    @Override
    public native float getHealth();

    @Override
    public native void requestModuleList();

    @Override
    public native void setArmour(float armour);

    @Override
    public native float getArmour();

    @Override
    public void setImmunities(PlayerImmunity playerImmunity) {
        setImmunityFlags(playerImmunity.hex);
    }

    @Override
    public native void setImmunityFlags(int flags);

    @Override
    public PlayerImmunity getImmunities() {
        return new PlayerImmunity(getImmunityFlags());
    }

    @Override
    public native int getImmunityFlags();

    @Override
    public void setPosition(Vector position) {
        setPosition(position.x, position.y, position.z);
    }

    @Override
    public native Vector getPosition();

    @Override
    public native void setPosition(float x, float y, float z);

    @Override
    public native Vector getSpeed();

    @Override
    public void setSpeed(Vector speed) {
        setSpeed(speed.x, speed.y, speed.z);
    }

    @Override
    public native void setSpeed(float x, float y, float z);

    @Override
    public void addSpeed(Vector speed) {
        addSpeed(speed.x, speed.y, speed.z);
    }

    @Override
    public native void addSpeed(float x, float y, float z);

    @Override
    public native void setHeading(float heading);

    @Override
    public native float getHeading();

    @Override
    public native void setAlpha(int alpha, int fadeTime);

    @Override
    public native int getAlpha();

    @Override
    public native boolean isOnFire();

    @Override
    public native boolean isCrouching();

    @Override
    public native int getAction();

    @Override
    public native int getGameKeys();

    @Override
    public native Vector getAimPosition();

    @Override
    public native Vector getAimDirection();

    @Override
    public native boolean putInVehicle(Vehicle vehicle, int slot, boolean makeRoom, boolean warp);

    @Override
    public native boolean removeFromVehicle();

    @Override
    public native int getInVehicleStatus();

    @Override
    public native int getInVehicleSlot();

    @Override
    public native Vehicle getVehicle();

    @Override
    public void setOption(PlayerOption setting, boolean value) {
        setOption(setting.ordinal(), value);
    }

    @Override
    public native void setOption(int settingId, boolean value);

    @Override
    public boolean getOption(PlayerOption setting) {
        return getOption(setting.ordinal());
    }

    @Override
    public native boolean getOption(int settingId);

    @Override
    public native void giveWeapon(int weaponId, int ammo);

    @Override
    public native void setWeapon(int weaponId, int ammo);

    @Override
    public native int getWeapon();

    @Override
    public native int getWeaponAmmo();

    @Override
    public native void setWeaponSlot(int slot);

    @Override
    public native int getWeaponSlot();

    @Override
    public native int getWeaponAtSlot(int slot);

    @Override
    public native int getAmmoAtSlot(int slot);

    @Override
    public native void removeWeapon(int weaponId);

    @Override
    public native void removeAllWeapons();

    @Override
    public void setCameraPosition(Vector position, Vector look) {
        setCameraPosition(position.x, position.y, position.z, look.x, look.y, look.z);
    }

    @Override
    public native void setCameraPosition(float posX, float posY, float posZ, float lookX, float lookY, float lookZ);

    @Override
    public native void restoreCamera();

    @Override
    public native boolean isCameraLocked();

    @Override
    public native void setAnimation(int groupId, int animationId);

    @Override
    public native void setWantedLevel(int wantedLevel);

    @Override
    public native int getWantedLevel();

    @Override
    public native Vehicle getStandingOnVehicle();

    @Override
    public native GameObject getStandingOnObject();

    @Override
    public native boolean isAway();

    @Override
    public native Player getSpectateTarget();

    @Override
    public native void setSpectateTarget(Player target);

    @Override
    public native int getPlayerClass();

    @Override
    public native void redirectToServer(String address, int port, String nick, String serverPassword, String userPassword);

    /*
    @Override
    public native void panCameraSmoothly(float posX, float posY, float posZ, int transitionMs);

    @Override
    public void panCameraSmoothly(Vector vec, int transitionMs) {
        this.panCameraSmoothly(vec.x, vec.y, vec.z, transitionMs);
    }

    @Override
    public native void set3DArrowForPlayer(Player player, boolean hasArrow);

    @Override
    public native boolean has3DArrowForPlayer(Player player);
  
    @Override
    public native void kill();

    @Override
    public native int getDrunkHandling();

    @Override
    public native void setDrunkHandling(int level);

    @Override
    public native int getDrunkVisuals();

    @Override
    public native void setDrunkVisuals(int level);
     */
 /* @Override
    public native float getNetworkStatistics(NetworkStatisticOption option);*/
}
