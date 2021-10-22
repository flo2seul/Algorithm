class Main {

    private static int[][] visited; //방문 여부
    private static int cnt; //영역의 크기 계산
    private static int[] X = {-1, 0, 1, 0}; // x 좌표, 좌 상 우 하
    private static int[] Y = {0, 1, 0, -1}; // y 좌표, 좌 상 우 하

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        visited = new int[sizeOfMatrix][sizeOfMatrix];
        List<Integer> matrix_list = new ArrayList<>(); //영역의 갯수 계산을 위해

        for (int i = 0; i < sizeOfMatrix; i++)
        {
            for (int j = 0; j < sizeOfMatrix; j++)
            {
            	//영역의 원소가 1, 방문하지 않은곳
                if (matrix[i][j] == 1 && visited[i][j] == 0)
                {
                    dfs(i, j, matrix);
                    matrix_list.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(matrix_list); // 영역은 오름차순으로 출력
        System.out.println(matrix_list.size());
          
        for(int i : matrix_list)
        {
            System.out.print(i + " ");
        }

    }

    private static void dfs(int x, int y, int[][] matrix)
    {
        visited[x][y] = 1;
        matrix[x][y] = 0;
        int nx;
        int ny;

        for (int i = 0; i < 4; i++)
        {
            nx = x + X[i];
            ny = y + Y[i];

            //이동할 수 있는 최대 최소 위치안에 있어야된다.
            if (nx >= 0 && ny >= 0 && nx < visited.length && ny < visited.length)
            {
                if (matrix[nx][ny] == 1 && visited[nx][ny] == 0)
                {
                    dfs(nx, ny, matrix);
                }
            }
        }
        //영역의 크기 증가
        cnt++;
    }
   }
