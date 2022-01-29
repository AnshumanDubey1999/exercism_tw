class TwelveDays {
    String verse(int verseNumber) {
        String[] numberInWords = {"zeroth", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] items = {"", "a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
        String verse = "On the "+ numberInWords[verseNumber]+ " day of Christmas my true love gave to me: ";
        for(int i = verseNumber; i > 1; i--){
            verse += items[i] + ", ";
        }
        if(verseNumber != 1)
            verse += "and ";
        verse += items[1]+".\n";
        return verse;
    }

    String verses(int startVerse, int endVerse) {
        String[] verseArray = new String[endVerse-startVerse+1];
        for(int i = startVerse; i <= endVerse; i++)
            verseArray[i-startVerse] = verse(i);
        return String.join("\n", verseArray);
    }
    
    String sing() {
        return verses(1,12);
    }
}
