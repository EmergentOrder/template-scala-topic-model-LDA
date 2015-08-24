package org.template.classification

import io.prediction.controller.IEngineFactory
import io.prediction.controller.Engine
import org.apache.spark.mllib.linalg.Vector

class Query(
  val text: String
) extends Serializable

class PredictedResult(
  val topTopic: (Array[(String,Double)]),
                     val topics: Array[(Int, Array[(String,Double)])]

) extends Serializable

class ActualResult(
                    val text: String
) extends Serializable

object ClassificationEngine extends IEngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("LDA" -> classOf[LDAAlgorithm]),
      classOf[Serving])
  }
}
