package sn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

import sn.Card;
import sn.Deck;
import sn.Player;
import sn.Row;

public class Game {
	private ArrayList<Row> rows = new ArrayList<Row>();
	private ArrayList<Player> players = new ArrayList<Player>();
	private Deck deck = new Deck();

	public Game(int p) {
		setPlayers(p);
		setRows();
		dealCardsToPlayer();
		dealCardsToRows();
	}

	public void Turn() {
		//implement the rule of each turn here.
		// ...
		
		
		
	}

	private void setPlayers(int p){
		if(p < 2) {
			System.out.println("Can't play alone, loser.");
			System.exit(0);
		} 

		if(p > 10) {
			System.out.println("Too many people, loser.");
			System.exit(0);
		}

		for (int i = 0; i < p; ++i){
			Player pal = new Player();
			players.add(pal);
		}
	}

	private void setRows(){
		//init four row
		for (int i = 0; i < 4; ++i){
			Row newrow = new Row();
			rows.add(newrow);
		}
	}

	private void dealCardsToPlayer() {
		for(Player p : players){
            for(int i = 0; i < 10; i++){
            	Card c = deck.Deal();
            	p.addCard(c);
            }

            p.sortHandByNumber();

            //test print
            p.printHand();
        }
	}

	private void dealCardsToRows() {
		for(Row r : rows){
        	Card c = deck.Deal();
        	r.addCard(c);
        	
			//test print
        	r.printRow();
        }
	}
}
