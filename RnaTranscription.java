import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        int size = dnaStrand.length();
        String from = "GCTA", to = "CGAU";
        StringBuilder sb = new StringBuilder(size);
        for(int i = 0; i < size; i++){
            char c = dnaStrand.charAt(i);
            int index = from.indexOf(c);
            sb.append(to.charAt(index));
        }
        return sb.toString();
            
    }

}
