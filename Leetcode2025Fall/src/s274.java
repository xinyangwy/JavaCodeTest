class s274 {
    public int hIndex(int[] citations) {
        int  n=citations.length;
        int h=0,maxh=0;

        for (int i = 0; i < n; i++) {
            int cnt=0;
            h=i+1;//个数
            for (int citation : citations) {
                if(citation>=h){
                    cnt++;
                }
            }
            if(cnt>=h){
                maxh=Math.max(maxh,h);
            }
        }
        return maxh;
    }
    //指他（她）至少发表了 h 篇论文，
}