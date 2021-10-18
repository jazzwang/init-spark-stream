import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming._

object Hello extends App {
  val conf = new SparkConf()
      .setAppName("Spark Streaming Example")
      .setMaster("local[*]")
  val ssc = new StreamingContext(conf, Seconds(1))
  val sc = ssc.sparkContext
  // start Spark Streaming Context
  ssc.start()
  // stop Spark Streaming Context
  ssc.stop()
}
