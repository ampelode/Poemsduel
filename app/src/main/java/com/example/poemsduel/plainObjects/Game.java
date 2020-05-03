package com.example.poemsduel.plainObjects;

public class Game {

    Player  _user1;
    Player _user2;
    String _textContent;
    int actual_rating;


    int score_user1;
    int score_user2;
    Boolean _isFight;
    Boolean _is_Friendly;
    Boolean is_done;


    public Player get_user1() {
        return _user1;
    }

    public void set_user1(Player _user1) {
        this._user1 = _user1;
    }

    public Player get_user2() {
        return _user2;
    }

    public void set_user2(Player _user2) {
        this._user2 = _user2;
    }

    public String get_textContent() {
        return _textContent;
    }

    public void set_textContent(String _textContent) {
        this._textContent = _textContent;
    }

    public int getActual_rating() {
        return actual_rating;
    }

    public void setActual_rating(int actual_rating) {
        this.actual_rating = actual_rating;
    }

    public int getScore_user1() {
        return score_user1;
    }

    public void setScore_user1(int score_user1) {
        this.score_user1 = score_user1;
    }

    public int getScore_user2() {
        return score_user2;
    }

    public void setScore_user2(int score_user2) {
        this.score_user2 = score_user2;
    }

    public Boolean get_isFight() {
        return _isFight;
    }

    public void set_isFight(Boolean _isFight) {
        this._isFight = _isFight;
    }

    public Boolean get_is_Friendly() {
        return _is_Friendly;
    }

    public void set_is_Friendly(Boolean _is_Friendly) {
        this._is_Friendly = _is_Friendly;
    }

    public Boolean getIs_done() {
        return is_done;
    }

    public void setIs_done(Boolean is_done) {
        this.is_done = is_done;
    }
    public Game(Player _user1, Player _user2, String _textContent, int actual_rating, int score_user1,
                int score_user2, Boolean _isFight, Boolean _is_Friendly, Boolean is_done) {

    }
}
