

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        DBconnect.connect();

        Document doc = Jsoup.connect("https://www.jobsearch.az/").get();


        List<JobInfo> jobInfoList = new ArrayList<>();

        for (Element table : doc.select("table.hotvac")) {
            for (Element row : table.select("tr")) {
                Elements tds = row.select("td");
                if (tds.size() > 3) {
                    JobInfo jobInfo = new JobInfo();
                    jobInfo.setPositon(tds.get(0).text());
                    jobInfo.setEmployes(tds.get(1).text());
                    jobInfo.setPosted(tds.get(2).text());
                    jobInfo.setDedline(tds.get(3).text());
                    jobInfoList.add(jobInfo);
                }
            }
        }


        for (JobInfo jobInfo:jobInfoList) {
            System.out.println(jobInfo);

        }
    }
}
