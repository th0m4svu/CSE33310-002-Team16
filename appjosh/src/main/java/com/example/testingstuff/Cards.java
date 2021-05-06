package com.example.testingstuff;

public class Cards {
    int suit = 0; // 0 = Clubs, 1 = Diamonds, 2 = Hearts, 3 = Spades
    int value = 0; // 0 = K, Q, J, 10, 1 = A, 2 = 2, ... 9 = 9

    public Cards(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }
}
