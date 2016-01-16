package sn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

import sn.Card;

class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();
 
    public Deck() {
        for(int i = 1; i <=104; i++){
            Card newcard = new Card(i);
            deck.add(newcard);
        }

        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card Deal() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}