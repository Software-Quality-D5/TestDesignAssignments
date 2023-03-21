package com.adamtharani.clustering;

import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.clustering.FarthestFirst;
import net.sf.javaml.clustering.SOM;
import net.sf.javaml.clustering.evaluation.ClusterEvaluation;
import net.sf.javaml.clustering.evaluation.SumOfSquaredErrors;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.tools.data.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Dataset data = FileHandler.loadDataset(new File("iris.data"), 4, ",");
        Clusterer kMeans = new KMeans(4);
        Clusterer farthestFirst = new FarthestFirst();
        Clusterer som = new SOM();

        Dataset[] clusterKMeans = kMeans.cluster(data);
        Dataset[] clusterFarthestFirst = farthestFirst.cluster(data);
        Dataset[] clusterSOM = som.cluster(data);

        System.out.println("KMeans");
        for (int i = 0; i < clusterKMeans.length; i++) {
            System.out.println("Cluster " + i);
            for (int j = 0; j < clusterKMeans[i].size(); j++) {
                System.out.println(clusterKMeans[i].get(j));
            }
        }

        System.out.println("FarthestFirst");
        for (int i = 0; i < clusterFarthestFirst.length; i++) {
            System.out.println("Cluster " + i);
            for (int j = 0; j < clusterFarthestFirst[i].size(); j++) {
                System.out.println(clusterFarthestFirst[i].get(j));
            }
        }

        System.out.println("SOM");
        for (int i = 0; i < clusterSOM.length; i++) {
            System.out.println("Cluster " + i);
            for (int j = 0; j < clusterSOM[i].size(); j++) {
                System.out.println(clusterSOM[i].get(j));
            }
        }



        ClusterEvaluation sse = new SumOfSquaredErrors();
        double kMeansscore = sse.score(clusterKMeans);
        double farthestFirstscore = sse.score(clusterFarthestFirst);
        double somscore = sse.score(clusterSOM);

        System.out.println("The score using KMeans is: " + kMeansscore);
        System.out.println("The score using farthestFirstscore is: " + farthestFirstscore);
        System.out.println("The score using SOM is: " + somscore);
    }
}
