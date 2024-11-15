package devops_practice_2.logic;

import org.springframework.stereotype.Component;

@Component
public class WordService {
    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
