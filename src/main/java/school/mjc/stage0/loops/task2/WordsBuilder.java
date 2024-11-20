package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder resultString = new StringBuilder();

        int counter = 0;

        while (counter < chars.length){
            resultString.append(chars[counter]);
            counter++;
        }

        System.out.print(resultString);
    }
}
