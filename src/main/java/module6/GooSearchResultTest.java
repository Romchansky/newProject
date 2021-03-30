package module6;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());

        System.out.println(new GooSearchResult("http://mountain.alps.com/resorts").parseDomain());
    }
}

class GooSearchResult {

    private String url;

    GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String[] arrSplit = url.split("/");
        return arrSplit[2];

    }
//    public String parseDomain() {
//        String domain;
//        if(url.startsWith("http:/") && url.endsWith("/")){
//            domain = url.substring(5);
//            return domain;
//        }
//        if(url.startsWith("https:/")){
//            domain = url.substring(6);
//            return  domain;
//        }
//        return "";
//    }
}
