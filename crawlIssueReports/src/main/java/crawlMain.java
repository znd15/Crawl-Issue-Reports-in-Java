public class crawlMain {
    public static void main( String[] args ) throws InterruptedException
    {
        Crawler crawl = new Crawler();
        Issue issue =  crawl.CrawlIssueReport();
        crawl.WritingDataToCSV(issue);
    }
}
