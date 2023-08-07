function setZeroes(matrix) {
    const rows = matrix.length;
    const cols = matrix[0].length;

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (matrix[i][j] === 1) {
                let ind = i - 1;
                while (ind >= 0) {
                    if (matrix[ind][j] !== 1) {
                        matrix[ind][j] = -1;
                    }
                    ind--;
                }
                ind = i + 1;
                while (ind < rows) {
                    if (matrix[ind][j] !== 1) {
                        matrix[ind][j] = -1;
                    }
                    ind++;
                }

                ind = j - 1;
                while (ind >= 0) {
                    if (matrix[i][ind] !== 1) {
                        matrix[i][ind] = -1;
                    }
                    ind--;
                }
                ind = j + 1;
                while (ind < cols) {
                    if (matrix[i][ind] !== 1) {
                        matrix[i][ind] = -1;
                    }
                    ind++;
                }
            }
        }
    }

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (matrix[i][j] < 0) {
                matrix[i][j] = 1;
            }
        }
    }
}


