package exercises;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double areaRemaining = (width * height) / areaPerBucket;
        return (int) Math.ceil(areaRemaining - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double bucketsNeeded = (width * height) / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) return -1;

        double areaAndBuckets = area / areaPerBucket;
        return (int) Math.ceil(areaAndBuckets);
    }

        public static void main(String[] args) {
            System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
            System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
            System.out.println(PaintJob.getBucketCount(6.26, 2.2));
    }

}
