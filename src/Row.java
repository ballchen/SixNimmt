package sn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

import sn.Card;
import sn.Deck;

class Row {
	private ArrayList<Card> row = new ArrayList<Card>();
	
	public Row() {

	}

	public ArrayList<Card> getRow() {
		return row;
	}

	public void addCard(Card card) {
		row.add(card);
	}

	public void clearRow() {
		row = new ArrayList<Card>();
	}

	public void printRow() {
		String rowToString = "[ ";
        for (Card card : row){
            rowToString += card.getNumber();
            rowToString += ", ";
        }
        rowToString = rowToString.substring(0, rowToString.length()-2);
        rowToString += " ]";

        System.out.println(rowToString);
	}

	public Card getLastCard() {
		Card last = row.get(row.size() - 1);
		return last;
	}
}