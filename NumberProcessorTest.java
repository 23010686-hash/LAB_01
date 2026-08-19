import org.junit.jupiter.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberProcessorTest {

    @Test
    void testStatementCoverage() {
        NumberProcessor processor = new NumberProcessor();

        // Lần 1: Chạy vào dòng 'return 0' khi numbers == null
        assertEquals(0, processor.sumEvenNumbers(null));

        // Lần 2: Chạy qua khởi tạo sum, vòng lặp for, điều kiện if (chẵn/lẻ) và cộng dồn sum
        assertEquals(6, processor.sumEvenNumbers(new int[]{2, 3, 4}));
    }

    @Test
    void testPathCoverage() {
        NumberProcessor processor = new NumberProcessor();

        assertEquals(0, processor.sumEvenNumbers(null));                // Đường 1: Mảng null
        assertEquals(0, processor.sumEvenNumbers(new int[]{}));          // Đường 2: Mảng rỗng (không vào for)
        assertEquals(0, processor.sumEvenNumbers(new int[]{1, 3, 5}));    // Đường 3: Toàn số lẻ (if luôn false)
        assertEquals(12, processor.sumEvenNumbers(new int[]{2, 4, 6}));   // Đường 4: Toàn số chẵn (if luôn true)
        assertEquals(6, processor.sumEvenNumbers(new int[]{1, 2, 3, 4})); // Đường 5: Kết hợp chẵn & lẻ
    }
}

