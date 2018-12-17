package me.icro.ai;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * AI核心代码, 估值上亿!
 */
public class AiMain {
    private static Map<String, String> REGEX_REPLACE_MAP = ImmutableMap.of(
            "吗", "",
            "？", "！",
            "\\?", "!"
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            input = scanner.next();
            for( Map.Entry<String, String> kv : REGEX_REPLACE_MAP.entrySet()) {
                Pattern p = Pattern.compile(kv.getKey());
                Matcher m = p.matcher(input);
                input = m.replaceAll(kv.getValue());
            }
            System.out.println(input);

        }
    }
}
