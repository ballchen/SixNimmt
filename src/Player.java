package sn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

import sn.Card;
import sn.Deck;

class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();
	private int nimmt = 0;

	public void addCard(Card card) {
		hand.add(card);
	}

    public Card decideCard() {
        //add AI here to let the player decide which card to add to the row
        // ...
        
        // delete this
        Card card = hand.get(0);
        return card;
    }

    public Card removeCard(int index){
        Card card = hand.get(index);
        hand.remove(index);
        return card;
    }

    public void sortHandByNumber(){
        Collections.sort(hand, new Comparator<Card>(){
            @Override
            public int compare(Card a, Card b){
                return a.getNumber() - b.getNumber();
            }
        });
    }

    public void printHand() {
    	String handToString = "[ ";
        for (Card card : hand){
            handToString += card.getNumber();
            handToString += ", ";
        }
        handToString = handToString.substring(0, handToString.length()-2);
        handToString += " ]";

        System.out.println(handToString);
    }

    public void addNimmt() {
    	nimmt ++;
    }
}