import java.util.*;

public class TileProblem
{
static int size_of_grid, b, a, cnt = 0;
static int[][] arr = new int[128][128];

static void place(int x1, int y1, int x2,
					int y2, int x3, int y3)
{
	cnt++;
	arr[x1][y1] = cnt;
	arr[x2][y2] = cnt;
	arr[x3][y3] = cnt;
    
}

static int tile(int n, int x, int y)
{
	int r = 0, c = 0;
	if (n == 2)
	{
	cnt++;
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
		if (arr[x + i][y + j] == 0)
		{
			arr[x + i][y + j] = cnt;
		}
		}
	}
	return 0;
	}

	
	for (int i = x; i < x + n; i++)
	{
	for (int j = y; j < y + n; j++)
	{
		if (arr[i][j] != 0)
		{
		r = i;
		c = j;

		}

	}
	}

	
	if (r < x + n / 2 && c < y + n / 2)
	place(x + n / 2, y + (n / 2) - 1, x + n / 2,
			y + n / 2, x + n / 2 - 1, y + n / 2);

	
	else if (r >= x + n / 2 && c < y + n / 2)
	place(x + (n / 2) - 1, y + (n / 2), x + (n / 2),
			y + n / 2, x + (n / 2) - 1, y + (n / 2) - 1);

	
	else if (r < x + n / 2 && c >= y + n / 2)
	place(x + n / 2, y + (n / 2) - 1, x + n / 2,
			y + n / 2, x + n / 2 - 1, y + n / 2 - 1);

	
	else if (r >= x + n / 2 && c >= y + n / 2)
	place(x + (n / 2) - 1, y + (n / 2), x + (n / 2),
			y + (n / 2) - 1, x + (n / 2) - 1,
			y + (n / 2) - 1);

	
	tile(n / 2, x, y + n / 2);
	tile(n / 2, x, y);
	tile(n / 2, x + n / 2, y);
	tile(n / 2, x + n / 2, y + n / 2);
	return 0;
}

// Driver code
public static void main(String[] args)
{

	Scanner sc = new Scanner(System.in);

	System.out.println("Size of the grid :");
    int size_of_grid = sc.nextInt();
    System.out.println("Coordinates which you want to mark blank");
    int a = sc.nextInt();
    int b = sc.nextInt();

	// Here tile can not be placed
	arr[a][b] = -1;
	tile(size_of_grid, 0, 0);

	// The grid is
	for (int i = 0; i < size_of_grid; i++)
	{
	for (int j = 0; j < size_of_grid; j++)
		System.out.print(arr[i][j] + " ");
	System.out.println();;
	}
}
}


