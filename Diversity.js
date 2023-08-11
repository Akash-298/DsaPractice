function processTestcase(n, k, incomes) {
    incomes.sort((a, b) => a - b);

    let count = 0;
    let maxFamilies = 0;

    for (let i = 0, j = 0; j < n; j++) {
        while (incomes[j] - incomes[i] > k) {
            i++;
        }
        count = j - i + 1;
        maxFamilies = Math.max(maxFamilies, count);
    }

    return maxFamilies;
}



