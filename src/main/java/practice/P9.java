package practice;

import java.util.*;

public class P9 {
    public static void main(String[] args) {
        Physician physician = new Physician();
        physician.setEditorText("editorText");
        physician.setTranscriptionSegments("transSegments");
        List<String> speakerList = new ArrayList<>();
        speakerList.add("A");
        speakerList.add("B");
        speakerList.add("A");
        speakerList.add("C");
        speakerList.add("E");
        physician.setSpeakers(speakerList);

        physician.getSpeakers().removeIf(e->!e.equalsIgnoreCase("A"));

        for(String str: physician.getSpeakers()){
            System.out.println(str);
        }
    }
}

