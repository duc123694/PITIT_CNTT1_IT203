import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này khá hay nhưng có vài đoạn rất xAu và cách viết hơi tuc. "
                + "Tuy nhiên nội dung nhìn chung ổn và đáng đọc cho sinh viên ngành CNTT.";

        String[] blacklist = {"xau", "bayba", "tuc"};

        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuffer filtered = new StringBuffer();
        while (matcher.find()) {
            String word = matcher.group();
            String replacement = "*".repeat(word.length());
            matcher.appendReplacement(filtered, replacement);
        }
        matcher.appendTail(filtered);
        String result = filtered.toString();
        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutIndex))
                    .append("...");

            result = sb.toString();
        }
        System.out.println("Đánh giá sau khi xử lý:");
        System.out.println(result);
    }
}
