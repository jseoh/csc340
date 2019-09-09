package Assg1;
import java.util.*;
import java.lang.String;

public class Array_LinkedList {
    private LinkedList<String> nouns = new LinkedList<String>();
    private LinkedList<String> pronouns = new LinkedList<String>();
    private LinkedList<String> verbs = new LinkedList<String>();
    private LinkedList<String> adjectives = new LinkedList<String>();
    private LinkedList<String> adverbs = new LinkedList<String>();
    private LinkedList<String> conjunctions = new LinkedList<String>();
    private LinkedList<String> prepositions = new LinkedList<String>();
    private LinkedList<String> interjections = new LinkedList<String>();
    private int howManyParts;
    private String word;

    public Array_LinkedList()
    {
        this.howManyParts = 0;
        this.word = "";
    }
    public Array_LinkedList(int i)
    {
        this.howManyParts = i;
        this.word = "";
    }
    public Array_LinkedList(int i, String s)
    {
        this.howManyParts = i;
        this.word = s;
    }
    public boolean storeMeaning (int partOfSpeech, String definition)
    {

        switch (partOfSpeech) {
            case 1:
                nouns.add(definition);
                return true;
            case 2:
                pronouns.add(definition);
                return true;
            case 3:
                verbs.add(definition);
                return true;
            case 4:
                adjectives.add(definition);
                return true;
            case 5:
                adverbs.add(definition);
                return true;
            case 6:
                conjunctions.add(definition);
                return true;
            case 7:
                prepositions.add(definition);
                return true;
            case 8:
                interjections.add(definition);
                return true;
            default:
                System.out.println("wrong switch input");
                return false;
        }
    }// Return true when it store the meaning successfully.

    public void printNoun() { System.out.println(nouns); }
    public void printPronouns()
    {
        System.out.println(pronouns);
    }
    public void printVerbs()
    {
        System.out.println(verbs);
    }
    public void printAdjectives()
    {
        System.out.println(adjectives);
    }
    public void printAdverb()
    {
        System.out.println(adverbs);
    }
    public void printConjunction()
    {
        System.out.println(conjunctions);
    }
    public void printPreposition()
    {
        System.out.println(prepositions);
    }
    public void printInterjection()
    {
        System.out.println(interjections);
    }

    public static void main(String[] args) {
        // write your code here


    }
}