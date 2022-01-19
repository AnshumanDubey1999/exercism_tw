import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        int size = dnaStrand.length();
        StringBuilder sb = new StringBuilder(size);
        for(int i = 0; i < size; i++){
            char c = dnaStrand.charAt(i);
            if(c=='G')
                sb.append('C');
            if(c=='C')
                sb.append('G');
            if(c=='T')
                sb.append('A');
            if(c=='A')
                sb.append('U');
        }
        return sb.toString();
            
    }

}
