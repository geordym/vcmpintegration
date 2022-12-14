package com.maxorator.vcmp.java.plugin.integration.player;

@SuppressWarnings("unused")
public class PlayerImmunity {

    public int hex;

    public PlayerImmunity(Flag... flags) {
        for (Flag flag : flags) {
            hex |= (1 << flag.ordinal());
        }
    }

    public PlayerImmunity(int hex) {
        this.hex = hex;
    }

    public void add(Flag flag) {
        hex |= (1 << flag.ordinal());
    }

    public void add(int flag) {
        hex |= (1 << flag);
    }

    public void remove(Flag flag) {
        hex &= ~(1 << flag.ordinal());
    }

    public void remove(int flag) {
        hex &= ~(1 << flag);
    }

    public boolean has(int flag) {
        return (hex & (1 << flag)) != 0;
    }

    public boolean has(Flag flag) {
        return (hex & (1 << flag.ordinal())) != 0;
    }

    public enum Flag {
        BulletProof,
        FireProof,
        ExplosionProof,
        CollisionProof,
        MeleeProof,
        CannotFall,
        NoCriticals
    }
}
