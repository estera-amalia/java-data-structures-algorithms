package assignment;

public class GraphAdjacencyMatrix {
public static void main(String[] args) {
	//number of vertices       
	int V = 4; 
	int[][] adjMatrix = new int[V][V];
	//adding edges
	addEdge(adjMatrix, 0, 1);
	addEdge(adjMatrix, 1, 2);
	addEdge(adjMatrix, 2, 3);
	addEdge(adjMatrix, 3, 0);
	//printing adjacency matrix
	printMatrix(adjMatrix);
		    }
	//undirected graph
public static void addEdge(int[][] matrix, int i, int j) {
		        matrix[i][j] = 1;
		        matrix[j][i] = 1; 
		    }
		    public static void printMatrix(int[][] matrix) {
		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
}
