import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

internal class TestMain {

    @Test
    fun test_gradle_and_kotlin_works() {
        assertFalse(Main.checkGradleAndTest(), "Should be false")
    }
}