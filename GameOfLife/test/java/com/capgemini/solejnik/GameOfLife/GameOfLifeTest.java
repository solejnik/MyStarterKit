package com.capgemini.solejnik.GameOfLife;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GameOfLifeTest {
	private GameOfLife gameOfLife;
	private int generation;
	private int aliveCeels;

	@Before
	public void initialize() {
		gameOfLife = new GameOfLife();
		Set<Point> firstCells = new HashSet<Point>();
		firstCells.add(new Point(91, 45));
		firstCells.add(new Point(92, 44));
		firstCells.add(new Point(92, 45));
		firstCells.add(new Point(92, 46));
		firstCells.add(new Point(93, 46));
		gameOfLife.initiateAliveCells(firstCells);
	}

	public GameOfLifeTest(int generation, int aliveCeels) {
		this.generation = generation;
		this.aliveCeels = aliveCeels;
	}

	@Parameterized.Parameters
	public static Collection generation() {
		return Arrays.asList(new Object[][] { { 1, 6 }, { 2, 7 }, { 3, 9 }, { 4, 8 }, { 5, 9 }, { 6, 12 }, { 7, 11 },
				{ 8, 18 }, { 9, 11 }, { 10, 11 }, { 11, 10 }, { 12, 13 }, { 13, 16 }, { 14, 19 }, { 15, 19 },
				{ 16, 23 }, { 17, 25 }, { 18, 35 }, { 19, 25 }, { 20, 32 }, { 21, 27 }, { 22, 37 }, { 23, 30 },
				{ 24, 46 }, { 25, 39 }, { 26, 45 }, { 27, 30 }, { 28, 31 }, { 29, 29 }, { 30, 27 }, { 31, 32 },
				{ 32, 32 }, { 33, 39 }, { 34, 34 }, { 35, 29 }, { 36, 34 }, { 37, 31 }, { 38, 34 }, { 39, 36 },
				{ 40, 33 }, { 41, 31 }, { 42, 29 }, { 43, 34 }, { 44, 31 }, { 45, 42 }, { 46, 37 }, { 47, 36 },
				{ 48, 45 }, { 49, 48 }, { 50, 64 }, { 51, 45 }, { 52, 60 }, { 53, 50 }, { 54, 67 }, { 55, 58 },
				{ 56, 66 }, { 57, 68 }, { 58, 72 }, { 59, 72 }, { 60, 79 }, { 61, 75 }, { 62, 80 }, { 63, 67 },
				{ 64, 69 }, { 65, 73 }, { 66, 65 }, { 67, 56 }, { 68, 61 }, { 69, 52 }, { 70, 53 }, { 71, 60 },
				{ 72, 65 }, { 73, 70 }, { 74, 71 }, { 75, 73 }, { 76, 65 }, { 77, 69 }, { 78, 77 }, { 79, 75 },
				{ 80, 67 }, { 81, 77 }, { 82, 77 }, { 83, 73 }, { 84, 84 }, { 85, 74 }, { 86, 87 }, { 87, 95 },
				{ 88, 90 }, { 89, 97 }, { 90, 98 }, { 91, 92 }, { 92, 103 }, { 93, 93 }, { 94, 97 }, { 95, 100 },
				{ 96, 95 }, { 97, 114 }, { 98, 108 }, { 99, 121 }, { 100, 121 }, { 101, 124 }, { 102, 125 },
				{ 103, 123 }, { 104, 132 }, { 105, 138 }, { 106, 150 }, { 107, 163 }, { 108, 152 }, { 109, 139 },
				{ 110, 145 }, { 111, 138 }, { 112, 144 }, { 113, 153 }, { 114, 152 }, { 115, 144 }, { 116, 135 },
				{ 117, 140 }, { 118, 137 }, { 119, 152 }, { 120, 148 }, { 121, 146 }, { 122, 147 }, { 123, 172 },
				{ 124, 167 }, { 125, 173 }, { 126, 161 }, { 127, 168 }, { 128, 164 }, { 129, 163 }, { 130, 178 },
				{ 131, 174 }, { 132, 174 }, { 133, 179 }, { 134, 162 }, { 135, 188 }, { 136, 167 }, { 137, 177 },
				{ 138, 161 }, { 139, 176 }, { 140, 182 }, { 141, 174 }, { 142, 167 }, { 143, 180 }, { 144, 188 },
				{ 145, 195 }, { 146, 197 }, { 147, 199 }, { 148, 221 }, { 149, 221 }, { 150, 214 }, { 151, 188 },
				{ 152, 195 }, { 153, 209 }, { 154, 204 }, { 155, 183 }, { 156, 188 }, { 157, 189 }, { 158, 185 },
				{ 159, 189 }, { 160, 185 }, { 161, 192 }, { 162, 179 }, { 163, 186 }, { 164, 173 }, { 165, 174 },
				{ 166, 184 }, { 167, 206 }, { 168, 181 }, { 169, 184 }, { 170, 165 }, { 171, 164 }, { 172, 155 },
				{ 173, 168 }, { 174, 140 }, { 175, 149 }, { 176, 141 }, { 177, 160 }, { 178, 162 }, { 179, 140 },
				{ 180, 152 }, { 181, 133 }, { 182, 142 }, { 183, 133 }, { 184, 135 }, { 185, 147 }, { 186, 149 },
				{ 187, 142 }, { 188, 147 }, { 189, 147 }, { 190, 145 }, { 191, 155 }, { 192, 146 }, { 193, 151 },
				{ 194, 132 }, { 195, 131 }, { 196, 122 }, { 197, 143 }, { 198, 119 }, { 199, 137 }, { 200, 120 },
				{ 201, 130 }, { 202, 119 }, { 203, 117 }, { 204, 115 }, { 205, 125 }, { 206, 118 }, { 207, 131 },
				{ 208, 114 }, { 209, 119 }, { 210, 111 }, { 211, 128 }, { 212, 110 }, { 213, 118 }, { 214, 102 },
				{ 215, 108 }, { 216, 109 }, { 217, 102 }, { 218, 110 }, { 219, 110 }, { 220, 108 }, { 221, 101 },
				{ 222, 109 }, { 223, 109 }, { 224, 105 }, { 225, 128 }, { 226, 105 }, { 227, 119 }, { 228, 113 },
				{ 229, 127 }, { 230, 126 }, { 231, 130 }, { 232, 123 }, { 233, 131 }, { 234, 136 }, { 235, 149 },
				{ 236, 148 }, { 237, 134 }, { 238, 139 }, { 239, 124 }, { 240, 126 }, { 241, 132 }, { 242, 124 },
				{ 243, 143 }, { 244, 133 }, { 245, 148 }, { 246, 137 }, { 247, 160 }, { 248, 145 }, { 249, 154 },
				{ 250, 144 }, { 251, 159 }, { 252, 153 }, { 253, 155 }, { 254, 152 }, { 255, 131 }, { 256, 141 },
				{ 257, 131 }, { 258, 132 }, { 259, 143 }, { 260, 146 }, { 261, 153 }, { 262, 141 }, { 263, 146 },
				{ 264, 154 }, { 265, 163 }, { 266, 164 }, { 267, 168 }, { 268, 165 }, { 269, 158 }, { 270, 168 },
				{ 271, 158 }, { 272, 170 }, { 273, 154 }, { 274, 163 }, { 275, 153 }, { 276, 160 }, { 277, 160 },
				{ 278, 177 }, { 279, 167 }, { 280, 193 }, { 281, 171 }, { 282, 180 }, { 283, 151 }, { 284, 143 },
				{ 285, 142 }, { 286, 146 }, { 287, 150 }, { 288, 149 }, { 289, 147 }, { 290, 149 }, { 291, 150 },
				{ 292, 159 }, { 293, 159 }, { 294, 165 }, { 295, 165 }, { 296, 159 }, { 297, 176 }, { 298, 170 },
				{ 299, 161 }, { 300, 168 },{5000,116},{10000,116} });
	}

	@Test
	public void testPrimeNumberChecker() {
		for (int i = 0; i < generation; i++) {
			gameOfLife.nextGeneration();
		}
		assertEquals(aliveCeels, gameOfLife.getAliveCells());
	}
}