package com.example.poemsduel.plainObjects;

public class Player {
    private Boolean _isFightReady;
    private Boolean _isFriendReady;
    private String _uid;
    private int strength;

    public Player(Boolean _isFightReady, Boolean _isFriendReady, String _uid, int strength, Boolean _isPlaying, Boolean is_spectating, Boolean _isActive) {
        this._isFightReady = _isFightReady;
        this._isFriendReady = _isFriendReady;
        this._uid = _uid;
        this.strength = strength;
        this._isPlaying = _isPlaying;
        this.is_spectating = is_spectating;
        this._isActive = _isActive;
    }

    public Boolean get_isFightReady() {
        return _isFightReady;
    }

    public void set_isFightReady(Boolean _isFightReady) {
        this._isFightReady = _isFightReady;
    }

    public Boolean get_isFriendReady() {
        return _isFriendReady;
    }

    public void set_isFriendReady(Boolean _isFriendReady) {
        this._isFriendReady = _isFriendReady;
    }

    public String get_uid() {
        return _uid;
    }

    public void set_uid(String _uid) {
        this._uid = _uid;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Boolean get_isPlaying() {
        return _isPlaying;
    }

    public void set_isPlaying(Boolean _isPlaying) {
        this._isPlaying = _isPlaying;
    }

    public Boolean getIs_spectating() {
        return is_spectating;
    }

    public void setIs_spectating(Boolean is_spectating) {
        this.is_spectating = is_spectating;
    }

    public Boolean get_isActive() {
        return _isActive;
    }

    public void set_isActive(Boolean _isActive) {
        this._isActive = _isActive;
    }

    private Boolean _isPlaying;
    private Boolean is_spectating;
    private Boolean _isActive;

}
