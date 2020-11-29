package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord){
        List<EnglishWord> englishWords =
                dictionary.getOrDefault(polishWord,new ArrayList<>());       //pobieramy z listy angielskie slowa jesli nie ma pusta lista dlatego f getorD
        englishWords.add(englishWord);                    // do tej listy alboo pustej nowej pustej dodajemy nasze slowo
        dictionary.put(polishWord, englishWords);       //put wstawi do mapy lub zaktualizuje instniejacy
    }

    public List<EnglishWord> findEnglishWords(String polishWord){

        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech){
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord,Collections.emptyList())){
            if(englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }

    public int size(){
        return dictionary.size();
    }

}
