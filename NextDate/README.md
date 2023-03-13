# Test Design Assignment-- NextDate-- test case design

## Steps
1. Identify the input parameters and their domains.
- **Day**: 1 <= Day <= 31
- **Month**: 1 <= Month <= 12
- **Year**: 1812 <= Year <= 2212

2. Determine the values to be used for each parameter.
- **Day**: 0, 1, 15, 28, 30, 31, 32
- **Month**: 0, 1, 2, 6, 13
- **Year**: 1811, 1812, 2000, 2212, 2213

3. Generate all pairwise combinations of parameter values

| Day | Month | Year |
| --- | --- | --- |
| 0 |	0 |	1811 |
| 0 |	1 |	1812 |
| 0 |	2 |	2000 |
| 0 |	6 |	2212 |
| 0 |	13 | 2213 |
| 1 |	1 |	2000 |
| 1 |	2 |	2212 |
| 1 |	6 |	2213 |
| 1 |	13 | 1811 |
| 1 |	0 |	1812 |
| 15 | 2 |	2213 |
| 15 | 6 |	1811 |
| 15 | 13 |	1812 |
| 15 | 0 |	2000 |
| 15 | 1 |	2212 |
| 28 | 6 |	1812 |
| 28 | 13 |	1811 |
| 28 | 1 |	2000 |
| 28 | 0 |	2212 |
| 28 | 1 |	2213 |
| 28 | 2 |	1811 |
| 30 | 13 |	1812 |
| 30 | 0 |	2000 |
| 30 | 1 |	2212 |
| 30 | 0 |	2213 |
| 30 | 2 |	1812 |
| 30 | 6 |	1811 |
| 31 | 0 |	2212 |
| 31 | 1 |	2213 |
| 31 | 2 |	1811 |
| 31 | 6 |	1812 |
| 31 | 13 |	2000 |
| 32 | 1 |	1811 |
| 32 | 0 |	1812 |
| 32 | 2 |	1812 |
| 32 | 6 |	2000 |
| 32 | 13 |	2212 |
| 32 | 0 |	2213 |

4. Generate Test Cases

| Day | Month | Year | Expected Output | Actual Output |
| --- | --- | --- | --- | --- |
| 0 |	0 |	1811 | Invalid |  |
| 0 |	1 |	1812 | Invalid |  |
| 0 |	2 |	2000 | Invalid |  |
| 0 |	6 |	2212 | Invalid |  |
| 0 |	13 | 2213 | Invalid |  |
| 1 |	1 |	2000 | 2/1/2000 |  |
| 1 |	2 |	2212 | 2/2/2212 |  |
| 1 |	6 |	2213 | Invalid |  |
| 1 |	13 | 1811 | Invalid |  |
| 1 |	0 |	1812 | Invalid |  |
| 15 | 2 |	2213 | Invalid |  |
| 15 | 6 |	1811 | Invalid |  |
| 15 | 13 |	1812 | Invalid |  |
| 15 | 0 |	2000 | Invalid |  |
| 15 | 1 |	2212 | 16/1/2212 |  |
| 28 | 6 |	1812 | 29/6/1812 |  |
| 28 | 13 |	1811 | Invalid |  |
| 28 | 1 |	2000 | 29/1/2000 |  |
| 28 | 0 |	2212 | Invalid |  |
| 28 | 1 |	2213 | Invalid |  |
| 28 | 2 |	1811 | Invalid |  |
| 30 | 13 |	1812 | Invalid |  |
| 30 | 0 |	2000 | Invalid |  |
| 30 | 1 |	2212 | 31/1/2212 |  |
| 30 | 0 |	2213 | Invalid |  |
| 30 | 2 |	1812 | 1/2/1812 |  |
| 30 | 6 |	1811 | Invalid |  |
| 31 | 0 |	2212 | Invalid |  |
| 31 | 1 |	2213 | Invalid |  |
| 31 | 2 |	1811 | Invalid |  |
| 31 | 6 |	1812 | Invalid |  |
| 31 | 13 |	2000 | Invalid |  |
| 32 | 1 |	1811 | Invalid |  |
| 32 | 0 |	1812 | Invalid |  |
| 32 | 2 |	1812 | Invalid |  |
| 32 | 6 |	2000 | Invalid |  |
| 32 | 13 |	2212 | Invalid |  |
| 32 | 0 |	2213 | Invalid |  |
