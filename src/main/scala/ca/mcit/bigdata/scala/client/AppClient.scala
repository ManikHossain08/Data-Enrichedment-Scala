package ca.mcit.bigdata.scala.client

import ca.mcit.bigdata.scala.fileWriting.{DataWriteToCSVFile, IOFileLinks}

/**
 * @author Manik Hossain
 * @version 1.0.0
 * @since 23-01-2021
 */

object AppClient extends App {
  val enrichedTrips = new DataWriteToCSVFile()
  enrichedTrips.writeFile(IOFileLinks.enrichedTripOutput)

}
